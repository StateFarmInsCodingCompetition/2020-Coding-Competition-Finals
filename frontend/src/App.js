import React, { useEffect, useState } from "react";
import "./App.css";
import axios from "axios";
import { AgGridColumn, AgGridReact } from "ag-grid-react";

import "bootstrap/dist/css/bootstrap.min.css";
import "ag-grid-community/dist/styles/ag-grid.css";
import "ag-grid-community/dist/styles/ag-theme-alpine.css";
import { ButtonGroup, Container, ToggleButton } from "react-bootstrap";

function Data({ file }) {
  const data = null;
  if (!data) {
    return <p>Loading...</p>;
  }

  const columns = Object.keys(data[0]);

  return (
    <div className="ag-theme-alpine" style={{ height: 500, width: 900 }}>
      <AgGridReact
        rowData={data}
        enableCharts={true}
        enableRangeSelection={true}
      >
        {columns.map((col) => (
          <AgGridColumn
            key={col}
            field={col}
            sortable={true}
            filter={true}
          ></AgGridColumn>
        ))}
      </AgGridReact>
    </div>
  );
}

function Viewer({ title, file }) {
  return (
    <>
      <h2>Viewing: {title}</h2>
      <Data file={file} />
    </>
  );
}

function App() {
  const options = [
    { name: "Adults", value: "adults" },
    { name: "Automobile MPG", value: "autosMpg" },
    { name: "Automobiles", value: "autos" },
    { name: "Cars", value: "cars" },
    { name: "Forest Fires", value: "forestFires" },
    { name: "Seoul Bike Data", value: "seoulBikeData" },
  ];
  const [radioValue, setRadioValue] = useState(options[0].value);

  return (
    <Container>
      <div className="App">
        <h1>State Farm 2020 Finals</h1>
        <div className="toggler">
        <ButtonGroup toggle>
          {options.map((radio, idx) => (
            <ToggleButton
              key={idx}
              type="radio"
              name="radio"
              value={radio.value}
              checked={radioValue=== radio.value}
              onChange={(e) => setRadioValue(e.currentTarget.value)}
            >
              {radio.name}
            </ToggleButton>
          ))}
        </ButtonGroup></div>
        <br />
        <Viewer title={options.find((opt) => opt.value == radioValue).name} file={radioValue} />
      </div>
    </Container>
  );
}

export default App;
