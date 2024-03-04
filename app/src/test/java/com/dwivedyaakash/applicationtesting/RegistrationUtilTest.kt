package com.dwivedyaakash.applicationtesting

import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test

class RegistrationUtilTest {

    private lateinit var registrationUtil: RegistrationUtil

    @Before
    fun setUp() {
        registrationUtil = RegistrationUtil
    }

    @After
    fun tearDown() {
    }

    @Test
    fun validateRegistrationInput() {
        val result = registrationUtil.validateRegistrationInput("Mack", "abc", "abc")
        assertEquals(true, result)
    }

    @Test
    fun `username empty return false`() {
        val result = registrationUtil.validateRegistrationInput("", "abc", "abc")
        assertEquals(false, result)
    }

    @Test
    fun `username already exists return false`() {
        val result = registrationUtil.validateRegistrationInput("Peter", "abc", "abc")
        assertEquals(false, result)
    }

    @Test
    fun `password empty return false`() {
        val result = registrationUtil.validateRegistrationInput("Mack", "", "")
        assertEquals(false, result)
    }

    @Test
    fun `password does not match return false`() {
        val result = registrationUtil.validateRegistrationInput("Mack", "abc", "xyz")
        assertEquals(false, result)
    }

    @Test
    fun `password contains less than 2 digits return false`() {
        val result = registrationUtil.validateRegistrationInput("Mack", "1", "1")
        assertEquals(false, result)
    }
}