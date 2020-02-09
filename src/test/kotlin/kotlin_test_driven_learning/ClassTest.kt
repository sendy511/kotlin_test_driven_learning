package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals


class ClassTest{
    @Test
    fun verify_property_with_customer_get(){
        val shape = Rectangle(10, 5)

        assertEquals(50, shape.area)
    }

    @Test
    fun test_extended_property(){
        assertEquals('n', "Yansen".myLastChar)
    }
}