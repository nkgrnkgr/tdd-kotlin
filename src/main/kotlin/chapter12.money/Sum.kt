package chapter12.money

class Sum(var augend: Money, var addend: Money) : Expression {
    override fun reduce(to: String): Money {
        var amount = augend.amount + addend.amount
        return Money(amount, to)
    }
}
