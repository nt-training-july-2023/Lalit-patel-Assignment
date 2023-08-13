import "./App.css";
import Counter from "./components/Counter";
import Form from "./components/Form";
import ParentComp from "./components/ParentComp";
import Persons from "./components/Persons";
import Comp1 from "./components/Comp1";
import { UserProvider } from "./UserContext";
import AxiosComp from "./components/AxiosComp";

function App() {
  return (
    <div className="App">
      <AxiosComp />
      {/* <UserProvider value="lalit">
        <Comp1 />
      </UserProvider> */}

      {/* <Form /> */}
      {/* <Persons /> */}
      {/* <ParentComp> */}
      {/* <Counter /> */}
    </div>
  );
}

export default App;
