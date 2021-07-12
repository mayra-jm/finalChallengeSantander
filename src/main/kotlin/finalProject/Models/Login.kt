package finalProject.Models

import s3.main

class Login {
    fun login(email: String, password:String): Boolean{
        if(email=="kotlin@bedu.org" && password=="Kotlindesarrollo"){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecta, por favor, vuelve a intentarlo")
            main()
            return false
        }
    }
}