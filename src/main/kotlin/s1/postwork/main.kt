package s1.postwork
val productPrice = 200
val productPrice2 = 150
val name = "Daniel"
val enterprise = "Bedu"
val uid = "3624-2332-5480"
val credit = 828.33
val gender = false
val age = 44

fun main(){
    println("El precio del artículo es de $productPrice")

    val amount = productPrice + productPrice2 // la suma del precio de unos productos
    val tax = 1.16f //el porcentaje con impuestos

    val total = amount*tax; //valor total con impuestos sumados
    println("El total a pagar es de $total pesos")

    val isLegal = age>=18
    println("El usuario es mayor de edad? $isLegal")
}