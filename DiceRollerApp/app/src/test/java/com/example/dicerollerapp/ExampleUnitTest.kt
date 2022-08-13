package com.example.dicerollerapp

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val rollRes = dice.roll()
        assertTrue("The value of rollRes was not between 1 and 6", rollRes in 1..6)
    }
}