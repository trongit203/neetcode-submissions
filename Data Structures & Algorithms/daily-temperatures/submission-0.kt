class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val stack = ArrayDeque<Int>()
        val n = temperatures.size
        val ans = IntArray(n)
        for (i in 0 until n) { 
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) { 
                val prev = stack.removeLast()
                ans[prev] = i - prev
            }
            stack.addLast(i)
        }
        return ans

        

        
        
        

        return ans
    }
}
