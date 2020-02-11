package kotlin_test_driven_learning

import java.lang.StringBuilder

fun <T> Collection<T>.myJoinToString(separator: String = ", ",
                                     prefix: String = "(",
                                     postfix: String = ")"): String {
    val result = StringBuilder(prefix)
    for ((index, value) in this.withIndex()) {
        result.append(value)
        if (index != this.size - 1)
            result.append(separator)
    }
    result.append(postfix)
    return result.toString()
}

fun namesToString(vararg names: String): String {
    val list = convertToList(names)
    return list.myJoinToString()
}

private fun convertToList(names: Array<out String>): ArrayList<String> {
    val list = ArrayList<String>()
    for (name in names) {
        list.add(name)
    }
    return list
}

class MyInt(private val value: Int) {
    infix fun myTo(other: Any) = Pair(value, other)
}