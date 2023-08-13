import React, { Component } from "react";
import { Userconsumer } from "../UserContext";

export class Comp3 extends Component {
  render() {
    return (
      <Userconsumer>
        {(value1) => {
          return <div>Hello {value1}</div>;
        }}
      </Userconsumer>
    );
  }
}

export default Comp3;
