import React from "react";


import SinglePage from "./pdf/single-page";
import AllPages from "./pdf/all-pages";

/* This is required only if the project file is located 
inside the app. Otherwise you can use the external link of the pdf file*/
import samplePDF from "./samplePDF.pdf";

//import "./styles.css";

export default function App() {
  return (
    <div className="App">
      <h4>Single Page</h4>
      <SinglePage pdf={samplePDF} />

      <hr />

      <h4>All Pages</h4>
      <div className="all-page-container">
        <AllPages pdf={samplePDF} />
      </div>

      <hr />
    </div>
  );
}