package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals

class LambdaTest {
    @Suppress("MoveLambdaOutsideParentheses")
    @Test
    fun test_different_lambda_express(){
        val numbers = listOf(1, 3, 5, 10)
        val originalVersion = numbers.maxBy({ x: Int -> x})
        assertEquals(10, originalVersion)

        val outOfParenthesisVersion = numbers.maxBy() { x: Int -> x}
        assertEquals(10, outOfParenthesisVersion)

        val ignoreParenthesisVersion = numbers.maxBy {x: Int -> x}
        assertEquals(10, ignoreParenthesisVersion)

        val itVersion = numbers.maxBy { it }
        assertEquals(10, itVersion)
    }

    @Test
    fun test_ways_of_running_lambda(){
        val printHello = { println("Hello")}

        printHello()
        run(printHello)
        run {println("Hello")}
    }
}