package com.dwivedyaakash.applicationtesting

import org.junit.Assert
import org.junit.Test

class PalindromeTest {

    @Test
    fun testNotPalindrome() {
        //Arrange
        val palindrome = Palindrome()

        //Act
        val result = palindrome.isPalindrome("hello")

        //Assert
        Assert.assertEquals(false, result)
    }

    @Test
    fun testIsPalindrome() {
        //Arrange
        val palindrome = Palindrome()

        //Act
        val result = palindrome.isPalindrome("level")

        //Assert
        Assert.assertEquals(true, result)
    }
}