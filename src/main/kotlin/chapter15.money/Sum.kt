package chapter15.money

class Sum(var augend: Money, var addend: Money) : Expression {
    override fun reduce(bank: Bank, to: String): Money {
        var amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}
