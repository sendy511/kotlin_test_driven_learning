package kotlin_test_driven_learning

class CollectionWithHead<T>(private val innerList: ArrayList<T>) :
        Collection<T> by innerList {
    constructor(initValue: T) : this(innerList = ArrayList()) {
        innerList.add(initValue)
    }

    override val size: Int
        get() = this.innerList.size - 1

    fun add(item: T){
        innerList.add(item)
    }
}
