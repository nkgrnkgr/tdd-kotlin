package chapter01.money

data class Dollar(var amount: Int) {
    fun times(multiplier: Int) {
        amount *= multiplier
    }
}
