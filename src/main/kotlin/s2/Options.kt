package s2

class Options {

    //para hacer login
    fun login(email: String, password:String): Boolean{
        if(email=="kotlin@bedu.org" && password=="Kotlindesarrollo"){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecto")
            return false
        }
    }

    //función para reproducir y  re-iniciar sonido
    fun play(sound: String){
        println("***Reproduciendo nota: $sound***")
    }

    fun reload(){
        println("**Comienza reproducción de nota músical**")
    }



}