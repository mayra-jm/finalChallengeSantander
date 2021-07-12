package finalProject.Models

class Options {

    //función para reproducir y  re-iniciar sonido
    fun play(sound: String){
        println("***Reproduciendo nota: $sound***")
    }

    fun reload(){
        println("**Comienza reproducción de nota músical**")
    }

}