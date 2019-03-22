package chapter01.money

data class Doliar(var amount: Int) {
    fun times(multiplier: Int) {
        amount *= multiplier
    }
}
