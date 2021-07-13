package finalProject.Models

import s3.Person
import s8.tiempoCarga

//se hace uso de POO al heredar atributos de Person
class AlumnRol(name:String, age:Int, city:String, schedule:String, var hability: String,var score: Int, var instrument: String)
    : Person(name, age, city, schedule) {

    init {

        var registroFinalizado = tiempoCarga()

        println("¡Excelente! $name \n " +
                "A continuación mostraremos tus datos ingresados para dar inicio a tu registro \n" +
                "Un momento por favor... \n")


        registroFinalizado.cargaPantallaRegistro()

        println("Nombre: $name \n Edad: $age \n Ciudad de residencia: $city \n")
        readLine().toString()

        println("Lecciones recomendadas para: $instrument  \n " +
                "Tu puntaje ha sido de :  $score \n " +
                "Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje \n " +
                "En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo"
        )

    }


}