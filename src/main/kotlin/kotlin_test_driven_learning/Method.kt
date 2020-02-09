package kotlin_test_driven_learning

import java.lang.StringBuilder

fun <T> Collection<T>.myJoinToString(seperator: String, prefix: String, postfix: String): String{
    val result = StringBuilder(prefix)
    for ((index, value) in this.withIndex()) {
        result.append(value)
        if (index != this.size - 1)
            result.append(seperator)
    }
    result.append(postfix)
    return result.toString()
}