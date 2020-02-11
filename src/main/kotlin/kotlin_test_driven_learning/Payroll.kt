package kotlin_test_driven_learning

object Payroll {
    val persons = ArrayList<Person>()

    fun calculateSalary(): Int {
        var totalMount = 0
        for(person in persons){
            when {
                // Notice the grammar here.
                (person.age ?: 0 > 30) -> totalMount += 10
                (person.age == 30) -> totalMount += 20
                else -> totalMount += 5
            }
        }
        return totalMount
    }

}
