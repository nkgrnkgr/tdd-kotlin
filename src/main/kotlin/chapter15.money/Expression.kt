package chapter15.money

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}