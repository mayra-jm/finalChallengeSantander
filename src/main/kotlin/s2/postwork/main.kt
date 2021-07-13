package s2.postwork

fun main (){

    val resultado = Function()

    resultado.loginUser("kotlinBedu", "123")

    resultado.pagar(105.50, 25.60)

    resultado.elegirPais("México")

    val usuarios = mapOf(
        "kotlin@bedu.org" to "Kotlindesarrollo",
        "daniel@cliente.com" to "Cliente123",
        "Fernando@empresa.mx" to "F3R2472"
    );

    val peliculas = setOf(
        "Scary movie",
        "Scary movie 2",
        "Las trillizas de Belleville",
        "Midori",
        "Doce monos",
        "Blade runner",
        "Mulán"
    )


    fun cartelera(){
        peliculas.forEach{
            println(it)
        }
    }
}