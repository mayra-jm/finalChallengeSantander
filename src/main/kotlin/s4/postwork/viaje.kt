package s4.postwork

data class viaje(
    val initTimeLocation: Int,
    val endTimesLocation: Int,
    val price: Double,
    val chauffeur: String,
    val idViaje: Int
)

data class TimeLocation
    (val timestamp: Long,
     val lat: Double,
     val long: Double)