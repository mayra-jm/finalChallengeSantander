package elShiro

class Persona {


    private var nombre: String = ""
    private var edad: Int = 0
    private var ciudad: String = ""
    private var telefono: String = ""
    private var correo: String = ""
    private var instrumento: String = ""
    private var rol: Int = 0

    private var habilidad: String = ""
    private var disponibilidadTiempo: String = ""
    val week = listOf("LUNES","MARTES", "MIERCOLES",  "JUEVES", "VIERNES" , "SABADO", "DOMINGO" )
    private var notaMusical: String = ""
    private var notaMusical2: String = ""
    private var primerAcierto: Int = 0
    private var segundoAcierto:Int = 0


    fun rolAlumnoMaestro(){

        println("Por favor selecciona tu perfil")
        println("1) Alumno")
        println("2) Profesor")

        rol = readLine()!!.toInt()

        when (rol){
            1 -> registroAlumno()
            2 -> registroMaestro()
            else -> println("Selecciona un perfil valido")
        }
        //NOTA: Hace falta agregar un ciclo para seleccionar un valor valido

    }

    fun registroAlumno(){
        println("¿Cuál es tu nombre?")
        nombre = readLine().toString()

        println("Bienvenido $nombre")

        println("¿Qué edad tienes?")
        edad = readLine()!!.toInt()

        println("¿De qué ciudad eres?")
        ciudad = readLine().toString()

        println("Por favor ingresa un número de contacto")
        telefono = readLine().toString()

        println("Por favor ingresa un correo electronico")
        correo = readLine().toString()

        println("¿Haz tocado algún instrumento músical (Si/No)?")

        habilidad = readLine().toString().toLowerCase()

        instrumento = if (habilidad == "si"){
            println("¿Qué instrumento haz tocado?")
            readLine().toString()
        } else {
            println("¿Qué instrumento te gustaría aprender a tocar?")
            readLine().toString()
        }

        do{
            (println("¿Qué día cuentas con mayor disponibilidad de tiempo?"))
            disponibilidadTiempo= readLine().toString().toUpperCase()
        } while (disponibilidadTiempo !in week)

        println("**Comienza reproducción de nota músical**")
        print("¿Qué nota musical escuchas?")
        notaMusical= readLine().toString().toLowerCase()

        if (notaMusical == "sol"){
            primerAcierto = 30
            println("Muy bien!")
        }
        println("Veamos si puedes reconocer la siguiente")
        println("**Comienza reproducción de nota músical**")
        println("¿Cuál es la nota musical?")
        notaMusical2= readLine().toString().toLowerCase()
        if(notaMusical2 == "do"){
            segundoAcierto = 70
            println("Excelente!")
        }
        println("Estamos procesando tu registro")
        println("Un momento por favor...")
        println("Registro exitoso")
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Ciudad de residencia: $ciudad")
        println("Lecciones recomendadas para $instrumento")
        println("Horario recomendado para lecciones: $disponibilidadTiempo")
        println("Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje")
        println("En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo")
        println("Tu puntaje ha sido de : ${primerAcierto + segundoAcierto}")
    }

    fun registroMaestro(){

        println("¿Cuál es tu nombre?")
        nombre = readLine().toString()

        println("Bienvenido $nombre")

        println("¿Qué edad tienes?")
        edad = readLine()!!.toInt()

        println("¿De qué ciudad eres?")
        ciudad = readLine().toString()

        println("Por favor ingresa un número de contacto")
        telefono = readLine().toString()

        println("Por favor ingresa un correo electronico")
        correo = readLine().toString()

        println("Eres profe")

    }



}





/*
class Persona {


    private var nombre: String = ""
    private var edad: Int = 0
    private var ciudad: String = ""
    private var telefono: String = ""
    private var correo: String = ""
    private var instrumento: String = ""
    private var rol: Int = 0

    private var habilidad: String = ""
    private var disponibilidadTiempo: String = ""
    val week = listOf("LUNES","MARTES", "MIERCOLES",  "JUEVES", "VIERNES" , "SABADO", "DOMINGO" )
    private var notaMusical: String = ""
    private var notaMusical2: String = ""
    private var primerAcierto: Int = 0
    private var segundoAcierto:Int = 0


    fun rolAlumnoMaestro(){

        println("Por favor selecciona tu perfil")
        println("1) Alumno")
        println("2) Profesor")

        rol = readLine()!!.toInt()

        if (rol == 1){
            registroAlumno()
        } else {
            registroMaestro()
        }
    }

    fun registroAlumno(){
        println("¿Cuál es tu nombre?")
        nombre = readLine().toString()

        println("Bienvenido $nombre")

        println("¿Qué edad tienes?")
        edad = readLine()!!.toInt()

        println("¿De qué ciudad eres?")
        ciudad = readLine().toString()

        println("Por favor ingresa un número de contacto")
        telefono = readLine().toString()

        println("Por favor ingresa un correo electronico")
        correo = readLine().toString()

        println("¿Haz tocado algún instrumento músical (Si/No)?")

        habilidad = readLine().toString().toLowerCase()

        instrumento = if (habilidad == "si"){
            println("¿Qué instrumento haz tocado?")
            readLine().toString()
        } else {
            println("¿Qué instrumento te gustaría aprender a tocar?")
            readLine().toString()
        }

        do{
            (println("¿Qué día cuentas con mayor disponibilidad de tiempo?"))
            disponibilidadTiempo= readLine().toString().toUpperCase()
        } while (disponibilidadTiempo !in week)

        println("**Comienza reproducción de nota músical**")
        print("¿Qué nota musical escuchas?")
        notaMusical= readLine().toString().toLowerCase()

        if (notaMusical == "sol"){
            primerAcierto = 30
            println("Muy bien!")
        }
        println("Veamos si puedes reconocer la siguiente")
        println("**Comienza reproducción de nota músical**")
        println("¿Cuál es la nota musical?")
        notaMusical2= readLine().toString().toLowerCase()
        if(notaMusical2 == "do"){
            segundoAcierto = 70
            println("Excelente!")
        }
        println("Estamos procesando tu registro")
        println("Un momento por favor...")
        println("Registro exitoso")
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Ciudad de residencia: $ciudad")
        println("Lecciones recomendadas para $instrumento")
        println("Horario recomendado para lecciones: $disponibilidadTiempo")
        println("Estimado usuario, es un gusto para nosotros poder ser parte del primer paso este nuevo viaje")
        println("En cuanto contemos con un maestro adecuado a tus habilidades y disponibilidad nos comunicaremos contigo")
        println("Tu puntaje ha sido de : ${primerAcierto + segundoAcierto}")
    }

    fun registroMaestro(){

        println("¿Cuál es tu nombre?")
        nombre = readLine().toString()

        println("Bienvenido $nombre")

        println("¿Qué edad tienes?")
        edad = readLine()!!.toInt()

        println("¿De qué ciudad eres?")
        ciudad = readLine().toString()

        println("Por favor ingresa un número de contacto")
        telefono = readLine().toString()

        println("Por favor ingresa un correo electronico")
        correo = readLine().toString()

        println("Eres profe")

    }
}
*/


