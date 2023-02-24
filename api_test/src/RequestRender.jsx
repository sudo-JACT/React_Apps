import Requester from "./Requester";
import { useState, useEffect } from 'react';

function Render(){

    const [post, setPosts] = useState([]);

    useEffect(() => {
            fetch('https://jsonplaceholder.typicode.com/posts')
                .then((res) => res.json())
                .then((data) => {
                    console.log(data);
                    setPosts(data);
                })
                .catch((err) => {
                    console.log(err.message);
                });
        }, []);



    const [rn, setRn] = useState(0);
    const [requestMsg, setRequestMsg] = useState('');
    const [response, setResponse] = useState(
        
        {
            name: "name",
            company: "company",
            id: 0,
            price: 0,
        }

    );

    const upateRequestMsg = (event) => {

        const value = event.target.value;

        setRequestMsg(value);

    }

    const makeArequest = (event) => {

        {/*
        useEffect(() => {
            fetch('https://jsonplaceholder.typicode.com/posts')
                .then((res) => res.json())
                .then((data) => {
                    console.log(data);
                    setPosts(data);
                })
                .catch((err) => {
                    console.log(err.message);
                });
        }, []);

    */}



    }

    return(

        <>
            <div className="cen">

                <h1>NUMBER OF REQUESTS: {rn}</h1>

            </div>

            <div className="cen">

                <div className="sm lol">
                    <ul class="list-group ">
                        <li class="list-group-item lol">Campo 1: {response.name}</li>
                        <li class="list-group-item lol">Campo 2: {response.company}</li>
                        <li class="list-group-item lol">Campo 3: {response.id}</li>
                        <li class="list-group-item lol">Campo 4: {response.price}</li>
                    </ul>
                </div>

                <br />

                <div className="form-floating sm cen iii">
                    <input type="email" className="form-control lol " id="floatingInput" placeholder="name@example.com" onChange={upateRequestMsg}/>
                    <label for="floatingInput" >Request Argument</label>
                </div>

                <br />

                <button type="button" className="btn btn-dark" onClick={makeArequest}>Dark</button>

            </div>
        
        </>


    );

}

export default Render;