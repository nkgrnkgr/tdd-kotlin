package chapter05.money

class Dollar(private val amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Dollar

        if (amount != other.amount) return false

        return true
    }

    override fun hashCode(): Int {
        return amount
    }
}
