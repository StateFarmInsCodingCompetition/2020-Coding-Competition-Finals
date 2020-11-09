import React, { useEffect, useMemo, useState } from "react";
import "./App.css";
import axios from "axios";
import { AgGridColumn, AgGridReact } from "ag-grid-react";
import { ModuleRegistry, AllModules } from "@ag-grid-enterprise/all-modules";

import "ag-grid-enterprise";
import "@ag-grid-enterprise/all-modules/dist/styles/ag-grid.css";
import "@ag-grid-enterprise/all-modules/dist/styles/ag-theme-alpine.css";

import "bootstrap/dist/css/bootstrap.min.css";
import { ButtonGroup, Container, Spinner, ToggleButton } from "react-bootstrap";

import MLR from "ml-regression-multivariate-linear";

ModuleRegistry.registerModules(AllModules);

async function train(data, output, columns) {
  // Filter anything with a null.
  let input = data.filter((row) => {
    return columns.every((col) => row[col] !== null);
  });

  // Convert to categorical as necessary.
  columns.forEach((col) => {
    // Detect if categorical.
    if (typeof input[0] !== "number") {
      const values = input.map((row) => row[col]);
      values.sort();

      input.forEach((row) => {
        const value = row[col];
        const cat = values.findIndex((v) => v === value);
        row[col] = cat;
      });
    }
  });

  // Downsample to a max of 1000.
  const MAX_SAMPLES = 10;
  if (input.length > MAX_SAMPLES) {
    input = input.slice(0, MAX_SAMPLES);
  }

  const X_cols = columns.filter((c) => c !== output);
  const X = input.map((row) => {
    return X_cols.map((col) => row[col]);
  });

  const Y = input.map((row) => row[output]);

  console.log("attempting training");
  // const mlr = new MLR(X, Y);
  return null;
  // return mlr;
}

function Predictor({ data, output }) {
  const columns = useMemo(() => {
    return Object.keys(data[0]);
  }, [data]);

  const [model, setModel] = useState(null);

  useEffect(() => {
    train(data, output, columns).then((m) => setModel(m));
  }, [data, output, columns]);

  return null;
}

function Grid({ data }) {
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

function Viewer({ title, file, output }) {
  const [data, setData] = useState(null);

  useEffect(() => {
    setData(null);
    axios.get(`/api/data/${file}`).then(({ data }) => {
      setData(data);
    });
  }, [file]);

  return (
    <>
      <h2>Viewing: {title}</h2>
      {data ? (
        <>
          <Grid data={data} />
          <Predictor data={data} output={output} />
        </>
      ) : (
        <Spinner animation="border" />
      )}
    </>
  );
}

function App() {
  const options = [
    { name: "Adults", value: "adults", output: "probabilityLabel" },
    { name: "Automobile MPG", value: "autosMpg" },
    { name: "Automobiles", value: "autos" },
    { name: "Cars", value: "cars" },
    { name: "Forest Fires", value: "forestFires" },
    { name: "Seoul Bike Data", value: "seoulBikeData" },
  ];
  const [radioValue, setRadioValue] = useState(options[0].value);

  const selected = options.find((opt) => opt.value === radioValue);

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
                checked={radioValue === radio.value}
                onChange={(e) => setRadioValue(e.currentTarget.value)}
              >
                {radio.name}
              </ToggleButton>
            ))}
          </ButtonGroup>
        </div>
        <br />
        <Viewer
          title={selected.name}
          file={selected.value}
          output={selected.output}
        />
      </div>
    </Container>
  );
}

export default App;
