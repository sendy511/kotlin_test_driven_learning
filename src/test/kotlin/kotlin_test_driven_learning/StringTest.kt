package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class StringTest{
    @Test
    fun verify_string_format(){
        val name = "Yansen"
        var helloMessage = ""

        /// Begin
        helloMessage = "Hello $name"
        ///

        assertEquals("Hello Yansen", helloMessage)
    }

    @Test
    fun verify_string_format_with_expression(){
        val message = "Hello ${getMyName()}"
        assertEquals("Hello Yansen", message)
    }
}