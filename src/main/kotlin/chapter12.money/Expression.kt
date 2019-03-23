package chapter12.money

interface Expression {
    fun reduce(to: String): Money
}