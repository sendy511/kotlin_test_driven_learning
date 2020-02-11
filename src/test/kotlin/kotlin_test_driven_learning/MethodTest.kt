package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class MethodTest{
     @Test
     fun invoke_expression_body_method(){
         val message = expressionBodyFun("Yansen")

         assertEquals("Hello Yansen", message)
     }

     @Test
     fun test_extended_method(){
         val names = arrayListOf("Yansen", "Jason")

         assertEquals("(Yansen, Jason)", names.myJoinToString(
                 separator = ", ", prefix = "(", postfix = ")"
         ))
     }

     @Test
     fun test_vararguments_method(){
         assertEquals("(Yansen, Jason)", namesToString("Yansen", "Jason"))
     }

     @Test
     fun verify_mid_fix_invoking(){
        val myInt = MyInt(1)

         assertEquals(Pair(1, 2), myInt myTo 2)
     }
}