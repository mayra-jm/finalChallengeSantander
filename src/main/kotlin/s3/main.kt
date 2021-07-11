package s3

import kotlinx.coroutines.*

var primerAcierto : Int = 0
var segundoAcierto: Int = 0
var instrumento: String = ""
var habilidad: String = ""

fun main(){
    var options = Options()
    var disponibilidadTiempo: String
    val week = setOf("LUNES","MARTES", "MIERCOLES",  "JUEVES", "VIERNES" , "SABADO", "DOMINGO" )

    println("Por favor selecciona tu tipo de perfil")
    println("1) Alumno")
    println("2) Profesor")
    var rol= readLine()?.toInt()
    when (rol){
        1 -> "Alumno"
        2 -> "Profesor"
        else -> println("Selecciona un perfil valido")
    }

    println("¿Cuál es tu nombre?")
    var nombre: String = readLine().toString()

    println("Bienvenido $nombre")

    println("¿Cuántos años tienes $nombre?")
    var edad: Int = readLine()!!.toInt()

    println("¿De qué ciudad eres?")
    var ciudad: String = readLine().toString()

    do{
        (println("¿Qué día cuentas con mayor disponibilidad de tiempo?"))
        disponibilidadTiempo= readLine().toString().toUpperCase()
    } while (disponibilidadTiempo !in week)


    if(rol == 1 ){
        println("¿Haz tocado algún instrumento músical (Si/No)?")
         habilidad  = readLine().toString().toLowerCase()
         instrumento = if (habilidad == "si"){
            println("¿Qué instrumento haz tocado?")
            readLine().toString()
        } else (if (habilidad == "no") {
             println("¿Qué instrumento te gustaría aprender a tocar?")
             println("1) Guitarra")
             println("2) Piano")
             println("3) Bateria")
             println("4) Violín")
             println("5) Bajo")
             println("6) Otro...")

             var instrumentoUsuario= readLine()?.toInt()

             when (instrumentoUsuario){
                 1 -> {
                     println("Interesante, la guitarra suele ser seleccionada por personas intensas y extremadamente sensitivas. \n " +
                             "Por este motivo, tocar la guitarra puede ayudarte a direccionar todas tus emociones.\n")
                 } 2 -> {
                 println("Interesante, el piano no lo suelen tocar las personas extrovertidas. \n" +
                         "Los pianistas suelen ser individuos con un alto sentido de la estética y la rectitud \n" +
                         "(Puntuales y muy disciplinados)\n")
             } 3 -> {
                 println("Interesante, las personas que tocan batería suelen ser personas seguras de sí mismas. \n" +
                         "Pero además, acorde a un estudio, los percusionistas tienen un cerebro único, al contar \n" +
                         "con una especie de cronómetro interno. \n")
             } 4 -> {
                 println("Interesante, Debido al tiempo de práctica que requiere, quienes toquen violín deben ser personas \n" +
                         "constantes y persistentes, que busquen resultados a largo plazo, y no impacientes. \n" +
                         "Asimismo, dado que se utilizan complicadas técnicas, debe ser alguien extremadamente prolijo y detallista.\n")
             } 5 -> {
                 println("Interesante, El bajo suele no ser identificado a primeras por alguna gente, pero es esencial para dar “ambiente” \n" +
                         "a la canción y unificar el sonido. Las personas que tocan bajo son personas que aman ser “partners”, y que no necesitan \n" +
                         "todo el tiempo ser el centro de atención, sino que están muy enfocados en los resultados más que en cómo se lucen. \n")
             } 6 -> {
                 println("Por favor ingresa el instrumento deseado")
                 var otroInstrumento = readLine().toString()
             } else -> {
                 println("Por favor selecciona una opción valida")
             }
             }

         } else {
             println("Error")
         }).toString()

        println("A continuación aplicaremos una breve actividad para conocer un poco sobre tus conocimientos en la materia.\n")
        println("Presiona Enter para continuar.\n")
        readLine().toString()

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
        readLine().toString()


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
        //Igual que el alumno
        println("Qué instrumento tocas?")
        instrumento  = readLine().toString().toLowerCase()
    }


    var score = primerAcierto + segundoAcierto

    val persona = Person("$nombre", edad, "$ciudad", "", "$disponibilidadTiempo")
    if(rol == 1){

        runBlocking {
            val buyJob = launch(Dispatchers.Default) {
                var percentage = 0

                while (percentage<100){
                    println("procesando pago: $percentage%")
                    delay(500)
                    percentage+=10
                }
                println("Pago exitoso!")
            }
        }

        val alumnRol = AlumnRol("$habilidad",score, "$instrumento" )
    }else if (rol == 2){
        val professRol = ProfessRol("$instrumento" )
    }


}

