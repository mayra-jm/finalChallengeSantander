package s3.postwork

class Mobile (
    val sku: Int,
    private val brand: String,
    val color: String,
    private val model: String,
    private val price: Double){

    init {
        println("El celular que pediste fue un $model de la marca $brand")
    }

}