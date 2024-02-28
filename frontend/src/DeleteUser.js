import React from 'react';
import { useState } from 'react'; 
import axios from 'axios';

function DeleteUser() {
    
    const url = 'http://localhost:8080/users/DeleteUser';
    const [username, setUsername] = useState('');
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');

    const handleDeleteUser = async () => {
        try {
            await axios.post(url, {username, email, password});
        } catch (error) {
            console.log(error);
        }
    }


  return (
    <div>
        <h2>Delete User</h2>
        <div>
            <label>Username:</label>
            <input type="text" value={username} onChange={(e) => setUsername(e.target.value)}/>
        </div>
        <div>
            <label>Email:</label>
            <input type="text" value={email} onChange={(e) => setEmail(e.target.value)}/>
        </div>
        <div>
            <label>Password:</label>
            <input type="password" value={password} onChange={(e) => setPassword(e.target.value)}/>
        </div>
        <div>
            <button onClick={handleDeleteUser}>Delete User</button>
        </div>
    </div>
  )
}

export default DeleteUser