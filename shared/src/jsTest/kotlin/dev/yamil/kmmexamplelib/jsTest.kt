package dev.yamil.kmmexamplelib

import kotlin.test.Test
import kotlin.test.assertTrue

class JsGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("Safari"), "Check Safari is mentioned")
    }
}
