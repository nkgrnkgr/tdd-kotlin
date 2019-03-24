package chapter15.money

class Pair(var from: String, var to: String) {
    override fun equals(other: Any?): Boolean {
        if (other is Pair) {
            return from.equals(other.from) && to.equals(other.to)
        }
        return false
    }

    override fun hashCode(): Int {
        return 0
    }
}