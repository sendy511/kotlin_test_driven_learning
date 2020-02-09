package kotlin_test_driven_learning

interface Expre

class Num(val value: Int) : Expre

class Sum(val left: Expre, val right: Expre) : Expre

fun eval(expre: Expre): Int {
    return when(expre){
        is Num -> expre.value
        is Sum -> eval(expre.left) + eval(expre.right)
        else -> throw Exception("Unknown Expre")
    }
}