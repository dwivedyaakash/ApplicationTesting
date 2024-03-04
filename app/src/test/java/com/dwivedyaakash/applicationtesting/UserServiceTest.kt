package com.dwivedyaakash.applicationtesting

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServiceTest {

    @Mock
    lateinit var userRepository: UserRepository

    @Before
    fun setUp(){
        // Initialize mocked objects
        MockitoAnnotations.openMocks(this)
        Mockito.`when`(userRepository.loginUser(anyString(), anyString())).thenReturn(LOGIN_STATUS.INVALID_PASSWORD)
    }

    @Test
    fun testUserService(){
        val sut = UserService(userRepository)
        val status = sut.loginUser("abc@gmail.com", "000000")
        Assert.assertEquals("Password is invalid", status)
    }
}