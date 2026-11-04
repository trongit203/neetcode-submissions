class MinStack() {
    val stack1 = mutableListOf<Int>()
    val stack2 = mutableListOf<Int>()
    var curMin = Int.MAX_VALUE

    fun push(`val`: Int) {
        if (`val` <= curMin) { 
            curMin = `val`
        }
        stack1.add(`val`)
        stack2.add(curMin)
    }

    fun pop() {
        stack1.removeLast()
        stack2.removeLast()
        if (stack2.isNotEmpty()) { 
            curMin = stack2[stack2.size - 1]
        } else { 
            curMin = Int.MAX_VALUE
        }
    }

    fun top(): Int {
        return stack1[stack1.size - 1]
    }

    fun getMin(): Int {
        return stack2[stack2.size - 1]
    }
}
