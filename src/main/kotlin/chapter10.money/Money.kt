package chapter10.money

abstract class Money(protected var amount: Int, protected var currency: String) {

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        other as Money

        if (amount != other.amount) return false
        if (currency != other.currency) return false

        return true
    }

    override fun hashCode(): Int {
        return amount
    }

    abstract fun currency(): String
}

fun dollar(amont: Int): Dollar {
    return Dollar(amont)
}

fun franc(amont: Int): Franc {
    return Franc(amont)
}
