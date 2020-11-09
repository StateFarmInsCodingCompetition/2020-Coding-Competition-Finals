
const chartType = document.getElementById('chartType');
const xAxisSelect = document.getElementById('xAxisSelect');
const yAxisSelect = document.getElementById('yAxisSelect');

var dataset;
$.get('./data/auto-mpg.csv', function(data) {
  dataset = $.csv.toObjects(data);
  // add keys to both x and y axis select
  var keys = Object.keys(dataset[0])
  keys.forEach(element => {
    var option = document.createElement("option");
    option.value = element;
    option.text = element;
    xAxisSelect.add(option);

    option = document.createElement("option");
    option.value = element;
    option.text = element;
    yAxisSelect.add(option);
  });
  // set the default
  xAxisSelect.value = keys[0];
  yAxisSelect.value = keys[1];
  updateChart();
  
});


// for dumym
var dataset = [{mpg:"10", cylinders:"5"}, {mpg:"12", cylinders:"6"}];


//Load auto mpg chart
function updateChart() {
  dataset = [{mpg:"10", cylinders:"5"}, {mpg:"12", cylinders:"6"}];
  xAxisSelect.value = "mpg";
  yAxisSelect.value = "cylinders";

  var ctx = document.getElementById('chart').getContext('2d');
  var myChart = new Chart(ctx, {
      type: chartType.value,
      data: {
          datasets: [{
              label: "Data",
              data: dataset,
              backgroundColor: 'rgba(255, 99, 132, 0.2)',
              parsing: {
                xAxisKey: "mpg",
                yAxisKey: "cylinders"
              },
          }]
      },
      options: {
        title: {
          display: true,
          text: "Auto MPG Dataset"
        },
        parsing: {
          xAxisKey: "mpg",
          yAxisKey: "cylinders"
        },
        scales: {
          yAxes: [{
            scaleLabel: {
              display: true,
              labelString: yAxisSelect.value
            },
          }],
          xAxes: [{
            scaleLabel: {
              display: true,
              labelString: xAxisSelect.value
            }
          }]
        }
      }
  });
}


