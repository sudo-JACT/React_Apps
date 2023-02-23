import CreateButton from "./CreateButton";
import { useState } from "react";

function Content(){

    let [tasks, setTasks] = useState([
        
        {
            id: 1,
            t: "FARE LA SPESA",
            did: false,
        },

        {
            id: 2,
            t: "LAVARE I PIATTI",
            did: false,
        },

        {
            id: 3,
            t: "FARE I COMPITI",
            did: false,
        },

        {
            id: 4,
            t: "TEST",
            did: true,
        },

    ]);

    let ntasks = 0;

    for (let i = 0; i < tasks.length; i++) {

        if (tasks[i].did === false) {

            ntasks++;
            
        }
        
    }

    return(

        <>

            <div className="sm">

                <label>TASK TO COMPLETE: {ntasks}</label>

                <form className="d-flex sl">

                    <input name="input1" id="input1" className="form-control me-2 sl lol" type="search" placeholder="Task" aria-label="Search"/>
                    <button className="btn btn-outline-lol sl" type="submit">Aggiungi</button>
                    
                </form>

                {

                    tasks.map((tt) =>(

                        <CreateButton task={tt.t}/>
                        
                    ))

                }


            </div>

        

            
        
        
        </>


    );
    
};

export default Content;