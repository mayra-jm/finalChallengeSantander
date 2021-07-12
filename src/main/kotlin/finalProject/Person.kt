package finalProject

const val PHONE_LENGTH = 10

open class Person  ( var name: String,
                var age: Int,
                var city: String,
                var schedule:String ) {


    private var phoneNumber: Long = 0

        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(value.toString().length == PHONE_LENGTH){
                field = value
            } else{
                println("El número que ingresaste es incorrecto")
            }
        }

    fun updateProfile(phoneNumber: Long, age:Int){
        this.phoneNumber = phoneNumber
        this.age =  age
    }


}