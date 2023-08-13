import React from "react";

function Childcomp(props) {
  return (
    <div>
      <button onClick={props.greetHandler}>greet</button>
    </div>
  );
}

export default Childcomp;
