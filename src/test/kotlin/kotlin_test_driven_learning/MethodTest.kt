package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class MethodTest{
     @Test
     fun invokeExpressionBodyMethod(){
         val message = expressionBodyFun("Yansen")

         assertEquals("Hello Yansen", message)
     }
}