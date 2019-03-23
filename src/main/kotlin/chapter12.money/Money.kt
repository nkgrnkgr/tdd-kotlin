package chapter12.money

open class Money(var amount: Int, protected var currency: String) {

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }

    fun reduce(to: String): Money {
        return this
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

fun dollar(amont: Int): Money {
    return Money(amont, "USD")
}

fun franc(amont: Int): Money {
    return Money(amont, "CHF")
}
