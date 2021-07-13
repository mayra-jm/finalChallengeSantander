package s6.postwork

open class SmartPhone(val price: Float, val name: String, val model: String, private val processor: String) {

    companion object {
        var stock = 0
            protected set

        fun restock(newStock: Int) {
            stock += newStock
        }

        fun minusStock() {
            stock--
        }
    }
}