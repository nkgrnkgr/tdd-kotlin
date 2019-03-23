package chapter05.money

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MoneyTest {

    @Test
    fun testMuliplication() {
        val five = Dollar(5)
        val product10 = five.times(2)
        assertEquals(Dollar(10), product10)
        val product15 = five.times(3)
        assertEquals(Dollar(15), product15)
    }

    @Test
    internal fun testEquality() {
        // Kotlin は data Class にすると equals と hasCode を自動で生成してくれるのでここではdataクラスではないものとする
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
    }
}