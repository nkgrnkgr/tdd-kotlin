package chapter12.money

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    internal fun testMuliplication() {
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

    @Test
    internal fun testSimpleAddition() {
        var five = dollar(5)
        var sum = five.plus(five)
        var reduced = Bank().reduce(sum, "USD")
        assertEquals(dollar(10), reduced)
    }

    @Test
    internal fun testPlusReturnsSum() {
        var five = dollar(5)
        var result = five.plus(five)
        if (result is Sum) {
            assertEquals(five, result.augend)
            assertEquals(five, result.addend)
        }
    }

    @Test
    internal fun testReduceSum() {
        var sum = Sum(dollar(3), dollar(4))
        var result = Bank().reduce(sum, "USD")
        assertEquals(dollar(7), result)
    }

    @Test
    internal fun testReduceMoney() {
        var result = dollar(1).reduce("USD")
        assertEquals(dollar(1), result)
    }
}