package com.dwivedyaakash.applicationtesting

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) return false
        if(username in existingUsers) return false
        if (password != confirmedPassword) return false
        if (password.length < 2) return false
        return true
    }
}