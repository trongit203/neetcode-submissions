class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        var longest = 0 
        for (n in numSet) { 
            if (!numSet.contains(n - 1)) { 
                var length = 1
                while (numSet.contains(n + length)) { 
                    length++
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}
