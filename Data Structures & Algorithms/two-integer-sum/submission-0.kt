class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        val n = nums.size
        for(i in 0 until n) {
            val complement = target - nums[i]
            if(map.containsKey(complement)) { 
                val complementIdx = map[complement]!!
                if (i > complementIdx) { 
                    return intArrayOf(complementIdx, i)
                } else { 
                    return intArrayOf(i, complementIdx)
                }
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}
