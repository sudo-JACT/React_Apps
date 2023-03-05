function Login() {

    return(

        <>
        
            <body>
                <form action="Login" method="POST">
                    <h2>Accedi</h2>

                    <label for="email">E-Mail</label>
                    <input type="email" name="email" id="email" required/>
                    
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" required/>

                    <input type="submit" value="Accedi"/>

      
                </form>
            </body>
        
        </>

    );




};

export default Login;








