package chapter03.money

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DollarTest {

    @Test
    fun testMuliplication() {
        val five = Dollar(5)

        val product = five.times(2)
        assertEquals(10, product.amount)
        val product1 = five.times(3)
        assertEquals(15, product1.amount)
    }
}