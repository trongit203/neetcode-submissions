class Solution {
    // fun topKFrequent(nums: IntArray, k: Int): IntArray {
    //     val map = mutableMapOf<Int, MutableList<Int>>()
    //     val n = nums.size
    //     for (i in 0 until n) {  // o(n)
    //         map.getOrPut(nums[i]) { mutableListOf() }.add(i)
    //     }
    //     val sortedMap = map.entries.sortedByDescending { (_, list) -> list.size} o()
    //    return sortedMap.take(k).map { it.key }.toIntArray()
    // }

    fun topKFrequent(nums: IntArray, k: Int): IntArray { 
        val freq = mutableMapOf<Int, Int>()
        for (num in nums) { 
        	freq[num] = freq.getOrPut(num) {0} + 1
        }
        val n = nums.size
        val valByFreq = Array(n + 1) { mutableListOf<Int>() } 
		for (entry in freq.entries) {
            val newListOfFreq = valByFreq[entry.value]
            newListOfFreq.add(entry.key)
        	valByFreq[entry.value] = newListOfFreq
        }
        val result = mutableListOf<Int>()
        for(i in valByFreq.size - 1 downTo 0) {
           	if (valByFreq[i].size > 0) { 
                val values = valByFreq[i]
				for(j in 0 until values.size) { 
                   		if (result.size >= k) {
                           break
                       }
					   result.add(values[j])
                }	
            }
        }
        return result.toIntArray()
    }

}
