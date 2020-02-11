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

    @Test
    fun verify_no_escape_string(){
        assertEquals("Hello \\\\", """Hello \\""")
    }

    @Test
    fun verify_new_split_function(){
        val str = "1.2.4-5"
        val strParts = str.split(".")
        assertEquals(listOf("1", "2", "4-5"), strParts)
    }
}