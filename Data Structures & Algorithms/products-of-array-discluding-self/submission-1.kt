class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n) {1}
        var prefix = 1
        var suffix = 1
        for (i in 0 until n) { 
            result[i] *= prefix
            prefix *= nums[i] 
        }
        for(i in n-1 downTo 0) { 
            result[i] *= suffix
            suffix *= nums[i]
        }
        return result
    }
}
