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
                 seperator = ", ", prefix = "(", postfix = ")"
         ))
     }
}