import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';


function Login() {


    const url = "http://localhost:8080/users/Login";
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate(); 

    const handleLogin = async () => {
        try {
            await axios.post(url, { email, password });
            navigate('/AllUsers');
        } catch (error) {
            console.log(error);
        }
    }    
    

  return (
    <div>
        <h2>Login</h2>
        <div>
            <label>Email:</label>
            <input type="text" value={email} onChange={(e) => setEmail(e.target.value)}/>
        </div>
        <div>
            <label>Password:</label>
            <input type="password" value={password} onChange={(e) => setPassword(e.target.value)}/>
        </div>
        <div>
            <button onClick={handleLogin}>Login</button>
        </div>
    </div>
  )
}

export default Login