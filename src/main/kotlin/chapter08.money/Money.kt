package chapter08.money

abstract class Money(protected var amount: Int) {

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
}

fun dollar(amont: Int): Dollar {
    return Dollar(amont)
}

fun franc(amont: Int): Franc {
    return Franc(amont)
}
