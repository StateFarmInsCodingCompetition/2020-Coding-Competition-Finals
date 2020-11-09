
const chartType = document.getElementById('chartType');
const xAxisSelect = document.getElementById('xAxisSelect');
const yAxisSelect = document.getElementById('yAxisSelect');

var dataset;
$.get('./data/autoMpg.csv', function(data) {
  dataset = $.csv.toObjects(data);
  // add keys to both x and y axis select
  var keys = Object.keys(dataset[0])
  keys.forEach(element => {
    var option = document.createElement("option");
    option.value = element;
    option.text = element;
    xAxisSelect.add(option);
    yAxisSelect.add(option)
  });
  // set the default
  xAxisSelect.value = keys[0];
  yAxisSelect.value = keys[1];
  updateChart();
  
});





//Load auto mpg chart
function updateChart() {
  var ctx = document.getElementById('chart').getContext('2d');
  var myChart = new Chart(ctx, {
      type: chartType.value,
      data: {
          datasets: [{
              data: [dataset]
          }]
      },
      options: {
        title: {
          display: true,
          text: "Auto MPG Dataset"
        },
        parsing: {
          xAxisKey: xAxisSelect.value,
          yAxisKey: yAxisSelect.value
        },
        scales: {
          yAxes: [{
            scaleLabel: {
              display: true,
              labelString: yAxisSelect.value
            },
            ticks: {
              beginAtZero: true
            }
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


