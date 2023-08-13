import React, { Component } from "react";
import Childcomp from "./Childcomp";

export class ParentComp extends Component {
  constructor(props) {
    super(props);
    this.state = {
      ParentName: "parents",
    };
  }

  greetparents = () => {
    alert(`hello ${this.state.ParentName}`);
  };
  render() {
    return (
      <div>
        <Childcomp greetHandler={this.greetparents}></Childcomp>
      </div>
    );
  }
}

export default ParentComp;
