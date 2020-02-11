package kotlin_test_driven_learning

val String.myLastChar: Char
    get() = this[this.length - 1]

interface Clickable {
    fun click()
    fun showOff() = println("I am clickable")
}

interface Focusable {
    fun focus()
    fun showOff() = println("I am focusable")
}

class Button : Clickable, Focusable{
    override fun click() {
        println("I am clickable button")
    }

    override fun focus() {
        println("I am focusable button")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        println("I am button")
    }
}