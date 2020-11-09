const model = tf.loadLayersModel('./adults_model/model.json');
const prediction = model.predict(example);
console.log(prediction)
