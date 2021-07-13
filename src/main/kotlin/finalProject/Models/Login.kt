package finalProject.Models

import s3.main

class Login {
    private var correo: String = ""
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(value.contains("@") ){
                field = value
            } else{
                println("El correo que ingresaste no es válido")
            }
        }

    private var pass: String = ""
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(!value.isEmpty()){
                field = value
            } else{
                println("Error al obtener tu contraseña")
                return
            }
        }

    fun updateLogin(correo: String, password:String){
        this.correo = correo
        this.pass =  password
    }

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

    fun inicioSesion(){
        println("Correo Electrónico:")
        var mail = readLine().toString()
        println("Contraseña:")
        var pass = readLine().toString()
        this.login(mail, pass)

    }
}