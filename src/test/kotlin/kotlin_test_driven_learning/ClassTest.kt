package kotlin_test_driven_learning

import kotlin.test.Test
import kotlin.test.assertEquals


class ClassTest{
    @Test
    fun verify_property_with_customer_get(){
        val shape = Rectangle(10, 5)

        assertEquals(50, shape.area)
    }

    @Test
    fun test_extended_property(){
        assertEquals('n', "Yansen".myLastChar)
    }

    @Test
    fun test_interface_implementation(){
        val button = Button()
        button.showOff()
    }

    @Test
    fun test_delegate_class_with_by(){
        val collection = CollectionWithHead("Start")
        collection.add("FirstRealItem")

        assertEquals(1, collection.size)
    }

    @Test
    fun test_singleton_object(){
        Payroll.persons.add(Person("jay30", 30))
        Payroll.persons.add(Person("jay31", 31))
        Payroll.persons.add(Person("jay29", 29))
        Payroll.persons.add(Person("jay0"))
        val totalSalary = Payroll.calculateSalary()

        assertEquals(40, totalSalary)
    }

    @Test
    fun test_method_reference(){
        val person = Person("Yansen", 10)
        val personName = person::name
        assertEquals("Yansen",personName())

        val expressionBodyFun = ::expressionBodyFun
        assertEquals("Hello Yansen", expressionBodyFun("Yansen"))
    }
}