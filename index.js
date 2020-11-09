$.get('/data/adults.csv', function(data) {
  const adultsData = $.csv.toObjects();
  console.log(adultsData)
});

$.get('/data/auto-mpg.csv', function(data) {
  const autoMpgData = $.csv.toObjects();
});

$.get('/data/autos.csv', function(data) {
  const autosData = $.csv.toObjects();
});

$.get('/data/cars.csv', function(data) {
  const carsData = $.csv.toObjects();
});

$.get('/data/forest-fires.csv', function(data) {
  const forestFiresData = $.csv.toObjects();
});

$.get('/data/seoul-bike-data.csv', function(data) {
  const seoulBikeData = $.csv.toObjects();
});

reader.readAsText("./data/adults.csv");
reader.onload = function(event) {
  var csv = event.target.result
  const adultsData = $.csv.toObjects();
  console.log(adultsData)
}
