package chapter15.money

class Sum(var augend: Expression, var addend: Expression) : Expression {
    override fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun times(multiplier: Int): Expression {
        return Sum(this.addend.times(multiplier), this.augend.times(multiplier))
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }
}
