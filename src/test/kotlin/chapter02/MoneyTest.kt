package chapter02

import chapter02.money.Dollar
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MoneyTest {

    @Test
    fun testMuliplication() {
        val five = Dollar(5)

        val product = five.times(2)
        assertEquals(10, product.amount)
        val product1 = five.times(3)
        assertEquals(15, product1.amount)
    }
}
