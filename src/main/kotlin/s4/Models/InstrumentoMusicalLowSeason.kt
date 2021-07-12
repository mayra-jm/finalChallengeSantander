package s4.Models

import s4.IPromotion

class InstrumentoMusicalLowSeason(instrumento: String) : InstrumentoMusical(instrumento), IPromotion {
    override  val discount = 10 //es porcentaje, osea 10%
    override val typeDiscount = 0 //0 para porcentaje, 1 para cantidad

    override fun getPrice(numDays: Int): Int {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }
}