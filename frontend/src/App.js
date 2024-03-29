import './App.css';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import SignUp from './SignUp';
import DeleteUser from './DeleteUser';
import AllUser from './AllUser';
import Login from './Login';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/SignUp' element={<SignUp/>}></Route>
        <Route path='/DeleteUser' element={<DeleteUser/>}></Route>
        <Route path='/AllUsers' element={<AllUser/>}></Route>
        <Route path='/Login' element={<Login/>}></Route>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
