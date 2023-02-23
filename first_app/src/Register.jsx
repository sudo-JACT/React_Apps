function Register() {


    return(

        <>

            <body>
                <form action="register" method="POST">
                    <h2>Registrati</h2>

                    <label for="email">E-Mail</label>
                    <input type="email" name="email" id="email" required/>

                    <label for="username">Username</label>
                    <input type="username" name="username" id="username" required/>
                    
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" required/>

                    <input type="submit" value="Registrati"/>

      
                </form>
            </body>
            










        </>

    );

};    