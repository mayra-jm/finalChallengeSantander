package finalProject

import finalProject.Models.AlumnRol
import finalProject.Models.Login
import finalProject.Models.Options
import finalProject.Models.ProfessRol
import s4.Models.InstrumentoMusical
import s4.Models.InstrumentoMusicalLowSeason
import s8.tiempoCarga

var primerAcierto: Int = 0
var segundoAcierto: Int = 0
var instrumento: String = ""
var habilidad: String = ""

fun main() {

    var options = Options()
    var carga = tiempoCarga()
    var login = Login()
    var disponibilidadTiempo: String
    val week = setOf("LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO")

    println("Bienvenido a Enarmonía \n Para acceder a esta aplicación, necesitas iniciar sesión \n ¿Te gustaría registrarte y formar parte de esta familia?")
    var register = readLine().toString().toUpperCase()
    if(register == "SI"){
        println("Ingresa tu correo electrónico")
        val email = readLine().toString()
        println("Ingresa tu contraseña")
        val pass = readLine().toString()
        login.updateLogin(email, pass )

    }else{
        println("Sentimos mucho que no te registres, vuelve pronto!")
        return
    }

    println("Felicidades! te has registrado exitosamente \n ------------------------------\nIniciar Sesión")

    login.inicioSesion()


    println("Por favor selecciona tu tipo de perfil")
    println("1) Alumno")
    println("2) Profesor")
    var rol = readLine()?.toInt()
    when (rol) {
        1 -> "Alumno"
        2 -> "Profesor"
        else -> println("Selecciona un perfil valido")
    }

    println("¿Cuál es tu nombre?")
    var nombre: String = readLine().toString()

    println("Bienvenido $nombre")

    println("¿Cuántos años tienes?")
    var edad: Int = readLine()!!.toInt()

    println("¿De qué ciudad eres?")
    var ciudad: String = readLine().toString()

    do {
        (println("¿Qué día cuentas con mayor disponibilidad de tiempo?"))
        disponibilidadTiempo = readLine().toString().toUpperCase()
    } while (disponibilidadTiempo !in week)


    if (rol == 1) {
        println("¿Haz tocado algún instrumento músical (Si/No)?")
        habilidad = readLine().toString().toLowerCase()
        if (habilidad == "si") {
            println("¿Qué instrumento haz tocado?")
            instrumento = readLine().toString()

        } else if (habilidad == "no") {
            println("¿Qué instrumento te gustaría aprender a tocar?")
            println("1) Guitarra")
            println("2) Piano")
            println("3) Bateria")
            println("4) Violín")
            println("5) Bajo")
            println("6) Otro...")
            var instrumentoUsuario = readLine()?.toInt()
            when (instrumentoUsuario) {
                1 -> {
                    println(
                        "Interesante, la guitarra suele ser seleccionada por personas intensas y extremadamente sensitivas. \n " +
                                "Por este motivo, tocar la guitarra puede ayudarte a direccionar todas tus emociones.\n"
                    )
                    instrumento = "Guitarra"

                }
                2 -> {
                    println(
                        "Interesante, el piano no lo suelen tocar las personas extrovertidas. \n" +
                                "Los pianistas suelen ser individuos con un alto sentido de la estética y la rectitud \n" +
                                "(Puntuales y muy disciplinados)\n"
                    )
                    instrumento = "Piano"
                }
                3 -> {
                    println(
                        "Interesante, las personas que tocan batería suelen ser personas seguras de sí mismas. \n" +
                                "Pero además, acorde a un estudio, los percusionistas tienen un cerebro único, al contar \n" +
                                "con una especie de cronómetro interno. \n"
                    )
                    instrumento = "Batería"
                }
                4 -> {
                    println(
                        "Interesante, Debido al tiempo de práctica que requiere, quienes toquen violín deben ser personas \n" +
                                "constantes y persistentes, que busquen resultados a largo plazo, y no impacientes. \n" +
                                "Asimismo, dado que se utilizan complicadas técnicas, debe ser alguien extremadamente prolijo y detallista.\n"
                    )
                    instrumento = "Violín"
                }
                5 -> {
                    println(
                        "Interesante, El bajo suele no ser identificado a primeras por alguna gente, pero es esencial para dar “ambiente” \n" +
                                "a la canción y unificar el sonido. Las personas que tocan bajo son personas que aman ser “partners”, y que no necesitan \n" +
                                "todo el tiempo ser el centro de atención, sino que están muy enfocados en los resultados más que en cómo se lucen. \n"
                    )
                    instrumento = "Bajo"
                }
                6 -> {
                    println("Por favor ingresa el instrumento deseado")
                    instrumento = readLine().toString()
                }
                else -> {
                    println("Por favor selecciona una opción válida")
                }
            }
        } else {
            println("Error")
        }
        println("A continuación aplicaremos una breve actividad para conocer un poco sobre tus conocimientos en la materia.\n")

        carga.cargaPantallaEvaluacion()

        options.play("uno")
        print("¿Desesa reproducirla de nuevo?")
        var again = readLine().toString().toUpperCase()

        if (again == "SI") {
            options.reload()
        }

        print("¿Qué nota musical escuchas?")
        var notaMusical: String = readLine().toString().toLowerCase()

        if (notaMusical == "sol") {
            primerAcierto = 30
            println("Muy bien!")
        }
        println("Veamos si puedes reconocer la siguiente")
        options.play("dos")
        print("¿Desesa reproducirla de nuevo?")
        again = readLine().toString().toUpperCase()

        if (again == "SI") {
            options.reload()
        }
        println("¿Cuál es la nota musical?")
        var notaMusical2: String = readLine().toString().toLowerCase()
        if (notaMusical2 == "do") {
            segundoAcierto = 70
            println("Excelente!")
        }
    } else if (rol == 2) {
        //Igual que el alumno
        println("Qué instrumento tocas?")
        instrumento = readLine().toString().toLowerCase()
    }


    var score = primerAcierto + segundoAcierto

    if (rol == 1) {
        AlumnRol("$nombre", edad, "$ciudad", "$disponibilidadTiempo", "$habilidad", score, "$instrumento")
        val precioCurso = InstrumentoMusical("$instrumento")
        precioCurso.quotePrice(1)
        val precioCursoDesc = InstrumentoMusicalLowSeason ("$instrumento")
        precioCursoDesc.reserve(1)


    } else if (rol == 2) {
         ProfessRol("$nombre", edad, "$ciudad", "$disponibilidadTiempo", "$instrumento")
    }


}

