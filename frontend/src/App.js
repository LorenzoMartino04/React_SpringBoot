import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import SignUp from './SignUp';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/SignUp' element={<SignUp/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
