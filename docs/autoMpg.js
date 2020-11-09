
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
var myChart;
//Load auto mpg chart
function updateChart() {
  var filteredDataset = [];
  dataset.forEach(obj => {
    var newObj = {x: obj[xAxisSelect.value], y: obj[yAxisSelect.value]};
    filteredDataset.push(newObj);
  });
  console.log(filteredDataset);
  myChart.destroy();
  var ctx = document.getElementById('chart').getContext('2d');
  myChart = new Chart(ctx, {
      type: chartType.value,
      data: {
          datasets: [{
              label: "Data",
              data: filteredDataset,
              backgroundColor: 'rgba(255, 99, 132, 0.2)',
          }]
      },
      options: {
        // parsing: {
        //   xAxisKey: "mpg",
        //   yAxisKey: "cylinders"
        // },
        title: {
          display: true,
          text: "Auto MPG Dataset"
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




function testChart() {
  dataset = [{mpg:"10", cylinders:"5"}, {mpg:"12", cylinders:"6"}];
  xAxisSelect.value = "mpg";
  yAxisSelect.value = "cylinders";

  var ctx = document.getElementById('chart').getContext('2d');
  myChart = new Chart(ctx, {
    type: 'scatter',
    data: {
        datasets: [{
            label: 'Scatter Dataset',
            data: [{
                a: "-10",
                y: "0"
            }, {
                a: "0",
                y: "10"
            }, {
                a: "10",
                y: "5"
            }],
            backgroundColor: 'rgba(255, 99, 132, 0.5)',
            
        }]
    },
    options: {
      parsing: {
        xAxisKey: "a"
      },
        scales: {
            xAxes: [{
                type: 'linear',
                position: 'bottom'
            }]
        }
    }
});
}