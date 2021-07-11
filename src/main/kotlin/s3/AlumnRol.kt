package s3

import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import s8.tiempoCarga

class AlumnRol(var hability: String,
               var score: Int,
               var instrument: String) {

    init {

        var registroFinalizado = tiempoCarga()

        registroFinalizado.pantallaRegistroFinalizado()

        println("Lecciones recomendadas para: $instrument  \n " +
                "Tu puntaje ha sido de :  $score \n " +
                "Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje \n " +
                "En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo"
        )
    }
}