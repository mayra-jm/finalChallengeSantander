package s3

var primerAcierto : Int = 0
var segundoAcierto: Int = 0
var instrumento: String = ""
var habilidad: String = ""

fun main(){
    var options = Options()
    var disponibilidadTiempo: String
    val week = setOf("LUNES","MARTES", "MIERCOLES",  "JUEVES", "VIERNES" , "SABADO", "DOMINGO" )

    println("¿Cuál es tu nombre?")
    var nombre: String = readLine().toString()

    println("Bienvenido $nombre")

    println("¿Qué edad tienes?")
    var edad: Int = readLine()!!.toInt()

    println("¿De qué ciudad eres?")
    var ciudad: String = readLine().toString()

    do{
        (println("¿Qué día cuentas con mayor disponibilidad de tiempo?"))
        disponibilidadTiempo= readLine().toString().toUpperCase()
    } while (disponibilidadTiempo !in week)

    println("Por favor selecciona tu perfil")
    println("1) Alumno")
    println("2) Profesor")
    var rol= readLine()?.toInt()
    when (rol){
        1 -> "Alumno"
        2 -> "Profesor"
        else -> println("Selecciona un perfil valido")
    }

    if(rol == 1 ){
        println("¿Haz tocado algún instrumento músical (Si/No)?")
         habilidad  = readLine().toString().toLowerCase()
         instrumento = if (habilidad == "si"){
            println("¿Qué instrumento haz tocado?")
            readLine().toString()
        } else {
            println("¿Qué instrumento te gustaría aprender a tocar?")
            readLine().toString()
        }
       options.play("uno")
        print("¿Desesa reproducirla de nuevo?")
        var again: String = readLine().toString().toUpperCase()

        if(again == "si"){
            options.reload()
        }
        print("¿Qué nota musical escuchas?")
        var notaMusical: String = readLine().toString().toLowerCase()

        if (notaMusical == "sol"){
            primerAcierto = 30
            println("Muy bien!")
        }
        println("Veamos si puedes reconocer la siguiente")
        options.play("dos")
        print("¿Desesa reproducirla de nuevo?")
        again= readLine().toString().toUpperCase()

        if(again == "si"){
            options.reload()
        }
        println("¿Cuál es la nota musical?")
        var notaMusical2: String = readLine().toString().toLowerCase()
        if(notaMusical2 == "do"){
            segundoAcierto = 70
            println("Excelente!")
        }
    }else if (rol == 2){
        println("Qué instrumento tocas?")
        instrumento  = readLine().toString().toLowerCase()
    }


    var score = primerAcierto + segundoAcierto

    val persona = Person("$nombre", edad, "$ciudad", "", "$disponibilidadTiempo")
    if(rol == 1){
        val alumnRol = AlumnRol("$habilidad",score, "$instrumento" )
    }else if (rol == 2){
        val professRol = ProfessRol("$instrumento" )
    }


}

