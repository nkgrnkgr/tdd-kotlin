package chapter09.money

class Dollar(amount: Int) : Money(amount, currency = "USD") {
    override fun currency(): String {
        return currency
    }

    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}
