package s4.postwork

class Mobile(
    private val brand: String,
    private val model:String,
    description: String,
    private val color: String,
    private val price: Double,
    sku:Int): Product(model,description,sku)
{

    init {
        println("El celular es un $model de la marca $brand")
    }

    override fun editProduct() {
        println("product edited!")
    }

}