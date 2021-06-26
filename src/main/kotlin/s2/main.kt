package s2

fun main(){
    var opciones = Options()
    var nombre: String
    var again: String
    var edad: Int
    var ciudad: String
    var habilidad: String
    var instrumento: String
    var disponibilidadTiempo: String
    var notaMusical: String
    var notaMusical2: String
    val week = setOf("LUNES","MARTES", "MIERCOLES",  "JUEVES", "VIERNES" , "SABADO", "DOMINGO" )


    println("¿Cuál es tu nombre?")

    nombre = readLine().toString()

    println("Bienvenido $nombre")

    println("¿Qué edad tienes?")

    edad = readLine()!!.toInt()

    println("¿De qué ciudad eres?")

    ciudad = readLine().toString()

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



    opciones.play("nota musical")
    print("¿Desesa reproducirla de nuevo?")
    again= readLine().toString().toUpperCase()
    if(again == "si"){
        opciones.reload()
    }
    print("¿Qué nota musical escuchas?")
    notaMusical= readLine().toString().toLowerCase()

    if (notaMusical == "sol"){
        println("Muy bien!")
    }
    println("Veamos si puedes reconocer la siguiente")
    opciones.play("nota musical")
    print("¿Desesa reproducirla de nuevo?")
    again= readLine().toString().toUpperCase()
    if(again == "si"){
        opciones.reload()
    }
    println("¿Cuál es la nota musical?")
    notaMusical2= readLine().toString().toLowerCase()
    if(notaMusical2 == "do"){
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
}

