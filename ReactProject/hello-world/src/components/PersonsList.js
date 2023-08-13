import React from "react";

function PersonsList({ person2 }) {
  return (
    <div>
      <h1>
        this is {person2.name} with id {person2.id} from {person2.city}
      </h1>
    </div>
  );
}

export default PersonsList;
