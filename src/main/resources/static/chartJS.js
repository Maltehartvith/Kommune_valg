
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

// Draw the chart and set the chart values
function drawChart() {


    let electionNumbers = google.visualization.arrayToDataTable([
        ['Parti', 'Antal stemmere'],
        ['Work', 8],
        ['Friends', 2],
        ['Eat', 2],
        ['TV', 2],
        ['Gym', 2],
        ['Sleep', 8]
    ]);

    let options = {'title':'Det perfekte valg', 'width':550, 'height':400};
    // Display the chart inside the <div> element with id="piechart"
    let chart = new google.visualization.PieChart(document.getElementById('piechart'));
    chart.draw(electionNumbers, options);
}