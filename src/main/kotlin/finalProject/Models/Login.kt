package finalProject.Models


class Login {
    private var correo: String = ""
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando contenga un @
            if(value.contains("@") ){
                field = value
            } else{
                println("El correo que ingresaste no es válido, vuelve a intentarlo")
                register()
                return
            }
        }

    private var pass: String = ""
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando el campo no se encuentre vacío
            if(!value.isEmpty()){
                field = value
            } else{
                println("Tu contraseña debe contener al menos 1 caracter, vuelve a intentarlo")
                register()
                return
            }
        }

    fun updateLogin(correo: String, password:String){
        this.correo = correo
        this.pass =  password
    }

    //función para validar el inicio de sesión
    fun login(email: String, password:String): Boolean{
        if(email== correo && password== pass){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecta, por favor, vuelve a intentarlo")
            inicioSesion()
            return false
        }
    }
    //función para realizar inicio de sesión
    fun inicioSesion(){
        println("Correo Electrónico:")
        var mail = readLine().toString()
        println("Contraseña:")
        var pass = readLine().toString()
        this.login(mail, pass)

    }
    //función para realizar el registro del usuario
    fun register(){
        println("Ingresa tu correo electrónico")
        val email = readLine().toString()
        println("Ingresa tu contraseña")
        val pass = readLine().toString()
        updateLogin(email, pass )
    }
}