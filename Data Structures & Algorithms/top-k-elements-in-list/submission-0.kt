class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int, MutableList<Int>>()
        val n = nums.size
        for (i in 0 until n) { 
            map.getOrPut(nums[i]) { mutableListOf() }.add(i)
        }
        val sortedMap = map.entries.sortedByDescending { (_, list) -> list.size}
       return sortedMap.take(k).map { it.key }.toIntArray()
    }
}
