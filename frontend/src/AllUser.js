import React from 'react'
import axios from 'axios';
import { useState, useEffect } from 'react'; 

function AllUser() {


    const url = 'http://localhost:8080/users/getAllUsers';
    const [users, setUsers] = useState([]);



    useEffect(() => {
        const handlegetAllUsers = async () => {
            try {
                const response = await axios.get(url);
                setUsers(response.data);
            } catch (error) {
                console.log(error);
            }
        }

        handlegetAllUsers();
    }, [])



  return (
    <div>
        <h2>All of the User</h2>
        <ul>
            {users && users.map((info, index) => (
                <li key={index}>{info.id} {info.username} {info.email} {info.password}</li>
            ))}
        </ul>
    </div>
  )
}

export default AllUser