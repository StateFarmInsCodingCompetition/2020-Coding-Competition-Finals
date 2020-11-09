var dataset;
$.get('./data/autoMpg.csv', function(data) {
  dataset = $.csv.toObjects(data);
});

//Load auto mpg chart
var ctx = document.getElementById('chart').getContext('2d');
var myChart = new Chart(ctx, {
    type: 'scatter',
    data: {
        datasets: [{
            data: [autoMpgData]
        }]
    },
    options: {
      parsing: {
        xAxisKey: 'displacement',
        yAxisKey: 'horsepower'
      },
      scales: {
        yAxes: [{
          scaleLabel: {
            display: true,
            labelString: 'HorsePower'
          },
          ticks: {
            beginAtZero: true
          }
        }],
        xAxes: [{
          scaleLabel: {
            display: true,
            labelString: 'Displacement'
          }
        }]
      }
    }
});

