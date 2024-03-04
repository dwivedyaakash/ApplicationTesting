package com.dwivedyaakash.applicationtesting

class ValidatePassword {

    fun passwordValidator(password: String): Boolean {
        if (password.isEmpty() ||password.length < 6 || password.length > 15) return false
        return true
    }
}