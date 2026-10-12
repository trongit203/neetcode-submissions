class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        nums.sort()
        // println("log-4: ${nums.contentToString()}")
        val n = nums.size

        if (n <= 1) return n
        var currFlag = nums[0]
        var count = 1
        var result = 1
        var i = 1
        while (i < n) { 
            if (nums[i] != currFlag && nums[i] - 1 != currFlag) { 
                count = 1
            } else if (nums[i] - 1 == currFlag)  {
                count++
            }
            // println("log-18: ${currFlag} - ${nums[i]}")
            currFlag = nums[i]
            result = maxOf(result, count)  
            // println("log-16: $currFlag - ${nums[i]} - $count")
            i++
        }   
        // println(result)
        // for (i in 1 until n) { 
        //     if (nums[i] - 1 != currFlag) { 
                
        //     } else { 
        //         result++
        //     }
        // }

        return result

        // 2,20,4,10,3,4,5
        // => 2,3,4,5
        // 0,3,2,5,4,6,1,1

        // sort

        // => 0,1,2,3,4,5,6    
        // {
        //     2: [0],
        //     3: [4],
        //     4: [2, 5]
        //     5: [6],
        // }
    }
}
