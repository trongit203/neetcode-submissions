class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var result = false
        val n = nums.size
        val set = mutableSetOf<Int>()
        for (i in 0 until n) { 
            if (set.contains(nums[i])) { 
                return true
            } else { 
                set.add(nums[i])
            }
        }
        return result
    }
}
