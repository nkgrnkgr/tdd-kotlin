package chapter10.money

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
        assertTrue(franc(5).equals(franc(5)))
        assertFalse(franc(5).equals(franc(6)))
        assertFalse(dollar(5).equals(franc(5)))
    }

    @Test
    fun testFrancMuliplication() {
        val five = franc(5)
        assertEquals(franc(10), five.times(2))
        assertEquals(franc(15), five.times(3))
    }

    @Test
    internal fun testCurrency() {
        assertEquals("USD", dollar(1).currency())
        assertEquals("CHF", franc(1).currency())
    }
}