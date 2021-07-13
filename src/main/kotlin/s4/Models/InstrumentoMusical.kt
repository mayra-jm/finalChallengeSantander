package s4.Models

open class InstrumentoMusical(override val instrumento:String): Curso(){
    override val country = "Mexico"

    //este map es un catálogo de los diferentes precios por mes dependiendo del instrumento
    protected val fees = mapOf(
        "Guitarra" to 1400,
        "Piano" to 1350,
        "Batería" to 1360,
        "Violín" to 1240,
        "Bajo" to 1320
    )

    override fun getPrice(numDays: Int): Int {
        val fee = fees[instrumento] //obtenemos la tarifa según el instrumento
        return if (fee==null) 0 else fee*numDays //regresa 0 si no hay tarifa, si sí, se realiza el cálculo
    }

    override fun quotePrice(numMonths: Int) {
        val price = getPrice(numMonths)
        if(price==0){ //si no existe tarifa para ese instrumento, se notifica al usuario
            println("Lo sentimos, aún no contamos con esas clases")
        } else{
            println("El costo mensual para las clases de $instrumento es de \$$price") //se notifica el precio al usuario
        }
    }
}