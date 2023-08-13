import React, { Component } from "react";

export class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  increament = () => {
    this.setState(
      {
        count: this.state.count + 1,
      },
      () => {
        console.log("this is callback value" + this.state.count);
      }
    );

    console.log(this.state.count);
  };

  increamentfive = () => {
    console.log("hii button is clicked");
    this.increament();
    this.increament();
    this.increament();
    this.increament();
    this.increament();
  };
  render() {
    return (
      <div>
        <div> Count - {this.state.count}</div>
        <button onClick={this.increamentfive}>Increament</button>
      </div>
    );
  }
}

export default Counter;
