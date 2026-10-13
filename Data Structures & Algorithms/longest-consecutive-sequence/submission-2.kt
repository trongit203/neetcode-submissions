class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        var numSet = nums.toSet()
        var longest = 0
        for (num in numSet) { 
            if (!numSet.contains(num - 1)) { 
                var length = 1
                while (numSet.contains(num + length)) { 
                    length++
                }
                longest = maxOf(longest, length)
            }
        }
        return longest
    }
}
