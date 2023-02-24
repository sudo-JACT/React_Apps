import CreateButton from "./CreateButton";
import { useState } from "react";

const Content = () => {

  const [x, setX] = useState(0);
  const [newTaskText, setNewTaskText] = useState("");
  const [tasks, setTasks] = useState([
    {
      id: 1,
      text: "FARE I COMPITI",
      done: false,
    },
    {
      id: 2,
      text: "SISTEMARE IL LETTO",
      done: true,
    },
  ]);

  const onAddBtnClick = (event) => {
    const newTask = {
      id: tasks.length,
      text: newTaskText,
      done: false,
    };

    const newTasks = tasks.push(newTask);
    setTasks([...tasks, newTask]);
  };
  const onAddTaskInputChange = (event) => {
    const value = event.target.value;
    setNewTaskText(value);
  };

  const checkIfDone = () =>{


  

    tasks.map((task) => {

      if (task.done === false) {

        let y = x + 1;
        setX(y);
            
      }

      return true;

    })

    

  };

  const checK = (event) => {

    const value = event.target.id;

    const newTasks = tasks.map((task) => {

      let task2;

      if (task.id === Number(value)) {

        task2 =  {

          id: task.id,
          text: task.text,
          done: true,

        }

        
      }else{

        task2 = task;

      }

      return task2;

    });

    setTasks(newTasks);

    checkIfDone();

  }

  return (
    <>
      {checkIfDone}
      <div className="sm">
        <label>TASK TO COMPLETE: {checkIfDone}{x}</label>

        <input name="input1" id="input1" className="form-control me-2 sl lol" type="search" placeholder="Task" aria-label="Search" onChange={onAddTaskInputChange}/>
        <button className="btn btn-outline-lol sl" onClick={onAddBtnClick}>
          Aggiungi
        </button>

        <div id="todo-list-container">
          {tasks.map((task, i) => {

            if (task.done === true) {

              return(
               
                <div id={i}>
                  <input className="form-check-input lol2" type="checkbox" id={task.id} checked/>
                  <label className="form-check-label" for="flexCheckDefault">
                    <s>{task.text}</s>
                  </label>
                </div>

              )

            }else{

              return(

                <div id={i}>
                  <input className="form-check-input lol2" type="checkbox" id={task.id} onClick={checK}/>
                  <label className="form-check-label" for="flexCheckDefault">
                    {task.text}
                  </label>
                </div>

              )

            }
          }
          
            )
          
          }
        </div>
      </div>
    </>
  );
};

export default Content;
