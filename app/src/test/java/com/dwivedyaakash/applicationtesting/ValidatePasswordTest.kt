package com.dwivedyaakash.applicationtesting

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun passwordValidator() {
        val result = validatePassword.passwordValidator("abcdwxyz")
        assertEquals(true, result)
    }

    @Test
    fun `password empty return false`() {
        val result = validatePassword.passwordValidator("")
        assertEquals(false, result)
    }

    @Test
    fun `password length less than 6 return false`() {
        val result = validatePassword.passwordValidator("abc")
        assertEquals(false, result)
    }

    @Test
    fun `password length more than 15 return false`() {
        val result = validatePassword.passwordValidator("lklldsnmdsnmdnsmsnmdnmndnmwdwd")
        assertEquals(false, result)
    }
}