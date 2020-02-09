package kotlin_test_driven_learning

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Yansen", 11), Person("Jason"))

    val maxPerson = persons.maxBy { it.age ?: 0 }

    println("Max age person is $maxPerson")
}