package s4.postwork

abstract class Product(
    val name: String,
    val description: String,
    var sku:Int){

    abstract fun editProduct()

}