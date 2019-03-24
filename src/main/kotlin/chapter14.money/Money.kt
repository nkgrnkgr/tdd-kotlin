package chapter14.money

class Money(var amount: Int, protected var currency: String) : Expression {
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    fun currency(): String {
        return currency
    }

    fun plus(addend: Money): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        var rate = bank.rate(currency, to) ?: 0
        return Money((amount / rate), to)
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
