package chapter06.money

class Franc(amount: Int) : Money(amount) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}
