package chapter01.money

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.assertEquals

internal class MoneyTest {

    @Test
    fun testMuliplication() {
        var five = Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}
