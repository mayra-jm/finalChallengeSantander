package s3.Models

import s3.Person
import s8.tiempoCarga

class ProfessRol (name: String, age:Int, city: String, schedule: String, var instrument: String):
    Person(name,age,  city, schedule) {

    init {

        var registroFinalizado = tiempoCarga()

        println("¡Excelente! $name \n " +
                "A continuación mostraremos tus datos ingresados para dar inicio a tu registro \n" +
                "Un momento por favor... \n")


        registroFinalizado.pantallaRegistroFinalizado()

        println("Las clases que deseas dar son de: $instrument  \n " +
                "Estimado profesor, es un gusto para nosotros tenerte en este equipo \n " +
                "En las próximas horas, nos pondremos en contacto contigo"
        )
    }

}