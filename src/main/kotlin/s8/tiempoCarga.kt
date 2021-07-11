package s8

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class tiempoCarga {

    //Función para agregar interacción de carga con el usuario.
    fun cargaPantallaEvaluacion(){
        runBlocking {
            val buyJob = launch(Dispatchers.Default) {
                var percentage = 0

                println("¿Preparado?\n")
                println("Presiona Enter para preparar tu evaluación")
                readLine().toString()
                println("Afinando intrumentos\n")
                while (percentage<100){
                    println("Carga al $percentage%")
                    delay(400)
                    percentage+=25
                }
                println("¡Evaluación lista!\n")
            }
        }
        println("Presiona Enter para continuar")
        println("¡MUCHA SUERTE!")
        readLine().toString()
    }

    fun cargaPantallaRegistro(){
        runBlocking {
            val buyJob = launch(Dispatchers.Default) {
                var percentage = 0

                println("Obteniendo información\n")

                while (percentage<100){
                    println("Carga al $percentage%")
                    delay(400)
                    percentage+=25
                }
                println("Para confirmar que tu información es correcta por favor presiona Enter")
            }
        }

    }

    fun pantallaRegistroFinalizado(){
        runBlocking {
            val buyJob = launch(Dispatchers.Default) {
                var percentage = 0

                println("Generando Registo")

                while (percentage<100){
                    println("Ingresando a la Base de Datos: $percentage%")
                    delay(500)
                    percentage+=15
                }
                println("Registro exitoso exitoso!")
            }
        }
    }

}