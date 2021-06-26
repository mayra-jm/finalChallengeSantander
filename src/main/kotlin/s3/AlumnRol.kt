package s3

class AlumnRol(var hability: String,
               var score: Int,
               var instrument: String) {

    init {
        println("Lecciones recomendadas para: $instrument  \n " +
                "Tu puntaje ha sido de :  $score \n " +
                "Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje \n " +
                "En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo"
        )
    }
}