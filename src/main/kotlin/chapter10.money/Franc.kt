package chapter10.money

class Franc(amount: Int) : Money(amount, currency = "CHF") {
    override fun currency(): String {
        return currency;
    }

    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}
