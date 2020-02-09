package kotlin_test_driven_learning

val String.myLastChar: Char
    get() = this[this.length - 1]
