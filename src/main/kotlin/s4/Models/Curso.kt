package s4.Models

abstract class Curso {

    abstract val country: String
    abstract val instrumento: String
    protected val serviceType = "Clases"
    protected var reserved = false
    protected var paidAmount = 0

    fun reserve(numDays: Int){
        if(reserved){
            println("""¡Ya reservaste tu curso! 
|                       Instrumento: $instrumento
|                       Precio: $paidAmount""".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount==0){
            return
        }
        reserved = true
        paidAmount = amount
        println("""¡Lugar reservado exitosamente! 
|                       Instrumento: $instrumento
|                       Precio con descuento del 10%: $$paidAmount""".trimMargin())
    }

    abstract fun quotePrice(numDays:Int)

    //es protected para que sólo se pueda obtener el valor numérico desde la clase
    protected abstract fun getPrice(numDays: Int): Int
}