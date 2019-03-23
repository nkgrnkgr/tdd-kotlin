package chapter03.money

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
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

    @Test
    internal fun testEquality() {
        // Kotlin は data Class にすると equals と hasCode を自動で生成してくれるのでここではdataクラスではないものとする
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}