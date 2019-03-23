package chapter09.money

abstract class Money(protected var amount: Int, protected var currency: String) {

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Money

        if (amount != other.amount) return false

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
