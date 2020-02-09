package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class BasicTypesTest{
    @Test
    fun test_null_able_int(){
        var nullableInt: Int? = null

        /// Begin
        nullableInt = 1
        ///

        assertEquals(1, nullableInt)
    }

    @Test
    fun test_must_invoke_conversion_function_when_different_type(){
        val aInt: Int
        val aShort: Short = 10

        /// Begin
        aInt = aShort.toInt()
        ///

        assertEquals(10, aInt)
    }

    @Test
    fun test_range_by_fuzz_buzz(){
        val nums = 1..20
        for (num in nums){
            val message = when {
                num % 5 == 0 && num % 3 == 0 -> "Fuzz & Buzz"
                num % 5 == 0 -> "Fuzz"
                num % 3 == 0 -> "Buzz"
                else -> "$num"
            }
            println(message)
        }
    }

    @Test
    fun test_create_map_by_to_method(){
        val range = hashMapOf(1 to "Yansen", 2 to "Jason")
        assertEquals("Yansen", range[1])
        assertEquals("Jason", range[2])
    }


}