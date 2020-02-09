package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class ExpressionTest{
    @Test
    fun test_when_expression(){
        val color = Color.RED

        val thisColorThing = when(color){
            Color.RED -> "Apple"
            Color.GREEN -> "Leaf"
            Color.BLUE -> "Sky"
        }

        assertEquals("Apple", thisColorThing)
    }

    @Test
    fun test_when_expression_without_parameter(){
        val color1 = Color.RED
        val color2 = Color.GREEN

        val thisColorThings = when {
            color1 == Color.RED && color2 == Color.GREEN -> "Apple Leaf"
            color1 == Color.GREEN && color2 == Color.BLUE -> "Leaf Sky"
            else -> throw Exception("Wrong combinationß")
        }

        assertEquals("Apple Leaf", thisColorThings)
    }

    @Test
    fun test_sum_expression(){
        val expre = Sum(Num(2), Sum(Num(5), Num(6)))
        val result = eval(expre)

        assertEquals(13, result)
    }
}