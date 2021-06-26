package s3

const val PHONE_LENGTH = 10

class Person  ( var name: String,
                var age: Int,
                var city: String,
                var rol: String,
                var schedule:String ) {

    init {
        println("Hey! $name estamos procesando tu registro \n " +
                "Un momento por favor... \n" +
                "Registro exitoso \n" +
                "Nombre: $name \n Edad: $age \n Ciudad de residencia: $city")
    }


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

    //para hacer login
    fun login(email: String, password:String): Boolean{
        if(email=="kotlin@bedu.org" && password=="Kotlindesarrollo"){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecto")
            return false
        }
    }


    }