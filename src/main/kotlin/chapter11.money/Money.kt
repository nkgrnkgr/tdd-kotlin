package chapter11.money

open class Money(protected var amount: Int, protected var currency: String) {

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    override fun equals(other: Any?): Boolean {
        other as Money

        if (amount != other.amount) return false
        if (currency != other.currency) return false

        return true
    }

    override fun hashCode(): Int {
        return amount
    }
}

fun dollar(amont: Int): Dollar {
    return Dollar(amont, "USD")
}

fun franc(amont: Int): Franc {
    return Franc(amont, "CHF")
}
