package com.dwivedyaakash.applicationtesting

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class AdditionTest {

    private lateinit var addition: Addition

    @Before
    fun setUp() {
        // Setup tasks to do before test cases are run
        addition = Addition()
    }

    @After
    fun tearDown() {
        // Tasks to do after every test case
    }

    @Test
    fun testAdditionEqual() {
        //Arrange
//        val addition = Addition()

        //Act
        val result = addition.add(5, 5)

        //Assert
        Assert.assertEquals(10, result)
    }

    @Test
    fun testAdditionNotEqual() {
        //Arrange
//        val addition = Addition()

        //Act
        val result = addition.add(50, 5)

        //Assert
        Assert.assertEquals(50, result)
    }
}