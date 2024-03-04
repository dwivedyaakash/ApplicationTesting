package com.dwivedyaakash.applicationtesting

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(private val input: String, private val expectedValue: Boolean) {

    @Test
    fun test() {
        val palindrome = Palindrome()
        val result = palindrome.isPalindrome(input)
        Assert.assertEquals(expectedValue, result)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }
    }
}