import React, { useEffect, useState } from "react";
import "./App.css";
import axios from "axios";
import { AgGridColumn, AgGridReact } from "ag-grid-react";

import 'ag-grid-community/dist/styles/ag-grid.css';
import 'ag-grid-community/dist/styles/ag-theme-alpine.css';

function Viewer({ key }) {
  const data = null;
  if (!data) {
    return <p>Loading...</p>;
  }

  const columns = Object.keys(data[0]);

  return (
    <div className="ag-theme-alpine" style={{ height: 500, width: 900 }}>
      <AgGridReact rowData={data} enableCharts={true} enableRangeSelection={true}>
        {columns.map(col => (
          <AgGridColumn key={col} field={col} sortable={true} filter={true}></AgGridColumn>
        ))}
      </AgGridReact>
    </div>
  );
}

function App() {
  // TODO: setup

  const options = [
    { name: 'Adults', value: 'adults'},
    { name: 'Automobile MPG', value: 'autosMpg'},
    { name: 'Automobiles', value: 'autos'},
    { name: 'Cars', value: 'cars'},
    { name: 'Forest Fires', value: 'forestFires'},
    { name: 'Seoul Bike Data', value: 'seoulBikeData'},
  ];

  return (
    <div className="App">
      hello there
    </div>
  );
}

export default App;
