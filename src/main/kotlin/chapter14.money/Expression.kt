package chapter14.money

interface Expression {
    fun reduce(to: String): Money
}