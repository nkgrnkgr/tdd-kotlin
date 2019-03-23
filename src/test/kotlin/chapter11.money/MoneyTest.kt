package chapter11.money

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    fun testMuliplication() {
        val five = dollar(5)
        assertEquals(dollar(10), five.times(2))
        assertEquals(dollar(15), five.times(3))
    }

    @Test
    internal fun testEquality() {
        // Kotlin は data Class にすると equals と hasCode を自動で生成してくれるのでここではdataクラスではないものとする
        assertTrue(dollar(5).equals(dollar(5)))
        assertFalse(dollar(5).equals(dollar(6)))
        assertFalse(franc(5).equals(dollar(5)))
    }

    @Test
    internal fun testCurrency() {
        assertEquals("USD", dollar(1).currency())
        assertEquals("CHF", franc(1).currency())
    }
}