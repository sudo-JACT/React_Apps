function CreateButton({task}) {

    if (task !== null){
       
        return(

            <>
                
                <br />
                <br />
                <div className="form-check">
                    <input className="form-check-input lol2" type="checkbox" value="" id="flexCheckDefault"/>
                    <label className="form-check-label" for="flexCheckDefault">
                        {task}
                    </label>
                </div>
                
            </>


        );

    }else{

        return(

            <>
            
                <br />
                <br />

                <div className="form-check">

                    <input className="form-check-input" type="checkbox" value="" id="flexCheckDefault"/>
                    <label className="form-check-label" for="flexCheckDefault">
                        ERROR
                    </label>

                </div>
            
            </>


        );

    }
    
};

export default CreateButton;