import tensorflow as tf
import keras
import csv
import pandas
from sklearn import model_selection
from keras import layers, models, optimizers
import os
import tensorflowjs as tfjs
def writefromCSVFile(stringName):
    returnArray = []
    with open(stringName) as csv_file:
        csv_reader = csv.reader(csv_file)
        line_count = 0
        for row in csv_reader:
            returnArray.append(row)
    return returnArray

adults = writefromCSVFile('adults.csv')

trainDF = pandas.DataFrame()
points = (len(adults))
features = (len(adults[0]))

discrete = []
continous = []
trainDF = pandas.DataFrame()

labels = []
data = []
for i in range(features):
  try:
    test = int(adults[1][i])
    continous.append(i)
  except:
    discrete.append(i)

for i in continous:
  for j in range(1,points):
    adults[j][i] = int(adults[j][i])

for i in range(features):
  allFeatures = ()
  for j in range(1,points):
    if (not adults[j][i] in allFeatures):
      allFeatures = allFeatures + (adults[j][i],)
    else:
      continue

  featureEncoding = {}

  for index, j in enumerate(allFeatures):
    featureEncoding[j] = index

  oneHot = []
  if (i in discrete):
    for j in range(1,points):
      oneHot.append(featureEncoding[adults[j][i]])
  else:
    for j in range(1,points):
      oneHot.append(adults[j][i])
  if (data == []):
    for index, j in enumerate(oneHot):
     data.append([j])
  elif (i == features - 1):
    print("labels")
    for index, j in enumerate(oneHot):
      labels.append(j)
  else:
    for index, j in enumerate(oneHot):
      data[index].append(j)

train_x, valid_x, train_y, valid_y = model_selection.train_test_split(data, labels)
print("Len of train_x: " + str(len(train_x)))
print("Len of valid_x: " + str(len(valid_x)))

model = keras.Sequential()
# model.add(keras.layers.Embedding(features, 16))
# model.add(keras.layers.GlobalAveragePooling1D())
model.add(keras.layers.Dense(features, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(16, activation=tf.nn.relu))
model.add(keras.layers.Dense(1, activation=tf.nn.sigmoid))

model.compile(optimizer='adam',
              loss='binary_crossentropy',
              metrics=['acc'])

train_seq_x = train_x
valid_seq_x = valid_x

checkpoint_dir = ''

checkpoint_path = "training_1/cp.ckpt"
checkpoint_dir = os.path.dirname(checkpoint_path)

cp_callback = tf.keras.callbacks.ModelCheckpoint(filepath=checkpoint_path,
                                                 save_weights_only=True,
                                                 verbose=1)

history = model.fit(train_seq_x,
                    train_y,
                    epochs=8,
                    batch_size=512,
                    validation_data=(valid_seq_x, valid_y),
                    verbose=1,
                    callbacks=[cp_callback])
tfjs.converters.save_keras_model(model, "adults_model")
