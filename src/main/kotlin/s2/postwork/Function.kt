package s2.postwork

class Function {
    //para hacer login si la aplicación lo requiere
    fun loginUser(user: String, pass:String): Boolean{
        if(user=="kotlinBedu" && pass=="123"){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecto")
            return false
        }
    }

    //si tenemos un reproductor de audio, podemos hacer una función para reproducir y otra para pausar
    fun reproducirCancion(cancion: String){
        println("Reproduciendo canción: $cancion")
    }

    fun pausar(){
        println("Canción pausada")
    }

    fun pagar(saldo:Double,precio:Double){
        if(saldo>=precio){
            saldo-precio
            println("Artículo comprado, saldo restante: $saldo pesos")
        } else{
            println("Necesitas saldo suficiente para poder comprar este producto")
        }
    }

    fun elegirPais(country:String){
        when(country){
            "México" ->{
                val idioma = "Español"
                val divisa = "Peso"
                println("Bienvenido a Bedu shop")
            }
            "Francia" -> {
                val idioma = "Francés"
                val divisa = "Euro"
                println("Soyez Bienvenu à Bedu shop")
            }
            "Estados Unidos" -> {
                val idioma = "Inglés"
                val divisa = "Dolar"
                println("Welcome to Bedu shop")
            }
            else ->{
                println("Lo sentimos, este servicio no está disponible en tu país")
            }

        }
    }

}