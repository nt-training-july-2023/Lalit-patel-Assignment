import React from "react";
import PersonsList from "./PersonsList";

function Persons() {
  const person = [
    {
      id: 1,
      name: "lalit",
      city: "Indore",
    },
    {
      id: 2,
      name: "shyam",
      city: "Indore",
    },
    {
      id: 4,
      name: "Akash",
      city: "Indore",
    },
    {
      id: 5,
      name: "Naveen",
      city: "Indore",
    },
  ];

  const personList = person.map((persons) => <PersonsList person2={persons} />);

  return <div>{personList}</div>;
}

export default Persons;
