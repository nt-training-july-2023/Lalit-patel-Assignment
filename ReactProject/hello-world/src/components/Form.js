import React, { Component } from "react";

export class Form extends Component {
  constructor(props) {
    super(props);
    this.state = {
      username: "",
      comments: "",
      type: "react",
    };
  }

  onUsernameChange = (event) => {
    this.setState({
      username: event.target.value,
    });
  };

  onCommentsChange = (event) => {
    this.setState({
      comments: event.target.value,
    });
  };

  onTypeChange = (event) => {
    this.setState({
      type: event.target.value,
    });
  };

  handleSubmit = (event) => {
    console.log("from is submitted");
    alert(`${this.state.username} ${this.state.comments} ${this.state.type}`);
    event.preventDefault();
  };

  render() {
    return (
      <div>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Username</label>
            <input
              type="text"
              value={this.state.username}
              onChange={this.onUsernameChange}
            ></input>
          </div>
          <div>
            <label>Comments</label>
            <textarea
              type="text"
              value={this.state.comments}
              onChange={this.onCommentsChange}
            ></textarea>
          </div>
          <div>
            <label>Courses</label>
            <select onChange={this.onTypeChange}>
              <option value="react">React</option>
              <option value="angular">Angular</option>
              <option value="view">View</option>
            </select>
          </div>

          <button type="submit">Submitform</button>
        </form>
      </div>
    );
  }
}

export default Form;
