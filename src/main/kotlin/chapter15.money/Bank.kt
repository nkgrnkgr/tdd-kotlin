package chapter15.money

class Bank {
    var rates = HashMap<Pair, Int>()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates.put(Pair(from, to), rate)
    }

    fun rate(from: String, to: String): Int? {
        if (from.equals(to)) return 1
        return rates.get(Pair(from, to))
    }
}
