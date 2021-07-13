package s7.postwork

import java.io.File
import java.text.SimpleDateFormat

fun main() {
    val fileStr = File("Archivo").inputStream().readBytes().toString(Charsets.UTF_8)
    //Como el archivo Archivo no existe, el sistema nos arrojará la siguiente excepción:
    //Exception in thread "main" java.io.FileNotFoundException: Archivo (No such file or directory)
    val formatData = SimpleDateFormat("MM, dd, yyyy").parse("fecha-invalida")
    /*arroja el siguiente error:
    Exception in thread "main" java.text.ParseException: Unparseable date: "fecha-invalida"
     */

    println("hola")
    Thread.sleep(1_000)
    println("adios")
    //pero si utilizamos un número negativo en el Thread, nos arrojará esta excepción porque el tiempo no puede ser negativo (no querrás viajar al pasado, doc).
    Thread.sleep(-1_000)
    /*
    el error sería el siguiente:
    Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
     */
}