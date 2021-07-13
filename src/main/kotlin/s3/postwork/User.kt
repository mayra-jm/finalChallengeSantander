package s3.postwork


class User (
    private val name: String,
    private var age: Int,
    private val email: String
    ){


    private var phoneNumber: Long = 0
    set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
        if(value.toString().length == PHONE_LENGTH){
            field = value
            println("El num de celular es " + this.phoneNumber)


        } else{
            println("El número que ingresaste es incorrecto")
        }
    }

    fun updateProfile(phoneNumber: Long, age:Int){
        this.phoneNumber = phoneNumber
        this.age =  age
        println("Tu edad se ha modificado correctamente " + this.age)
    }
}