const adultsData;
const autoMpgData;
const autosData;
const carsData;
const forestFiresData;
const seoulBikeData;

$.get('/data/adults.csv', function(data) {
  adultsData = $.csv.toObjects();
  console.log(adultsData)
});

$.get('/data/auto-mpg.csv', function(data) {
  autoMpgData = $.csv.toObjects();
});

$.get('/data/autos.csv', function(data) {
  autosData = $.csv.toObjects();
});

$.get('/data/cars.csv', function(data) {
  carsData = $.csv.toObjects();
});

$.get('/data/forest-fires.csv', function(data) {
  forestFiresData = $.csv.toObjects();
});

$.get('/data/seoul-bike-data.csv', function(data) {
  seoulBikeData = $.csv.toObjects();
});

reader.readAsText("./data/adults.csv");
reader.onload = function(event) {
  var csv = event.target.result
  const adultsData = $.csv.toObjects();
  console.log(adultsData)
}
