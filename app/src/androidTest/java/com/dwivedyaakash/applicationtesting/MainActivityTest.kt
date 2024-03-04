package com.dwivedyaakash.applicationtesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @JvmField
    @Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun noOfTimesButtonClickedTest() {
        onView(withId(R.id.change_number_button)).perform(click())
        onView(withId(R.id.change_number_button)).perform(click())
        onView(withId(R.id.change_number_button)).perform(click())
        onView(withId(R.id.change_number_button)).perform(click())
        onView(withId(R.id.change_number_button)).perform(click())
        onView(withId(R.id.change_number))
            .check(matches(withText("5")))
    }

}