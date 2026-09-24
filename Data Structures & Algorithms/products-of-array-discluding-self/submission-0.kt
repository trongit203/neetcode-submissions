class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n)
        val prefix = IntArray(n)
        val suffix = IntArray(n)
        var prevPrefix = 1
        var prevSuffix = 1
        for (i in 0 until n) { 
            prefix[i] = prevPrefix
            suffix[n-i-1] = prevSuffix
            prevPrefix *= nums[i]
            prevSuffix *= nums[n-i-1]
        }
        for(i in 0 until n) { 
            result[i] = prefix[i] * suffix[i]
        }
        return result
    //     1 * 2 * 4 * 6 = 48
    //     48

    //     [1,2,4,6]
        
    //     [1,1,2,8]
    //     [48,24,6,1]

    // =>  [48,24,12,8] 
        


    //     2,4,6
    //     1,4,6
    //     1,2,6
    //     1,2,4
    //     2 window:
    //     - w1 = [], w2 = [2,4,6]
    //     - w1 = [1], w2 = [4,6]
    //     - w1 = [1,2], w2 = [6]
    //     - w1 = [1,2,4], w2 = []

    //     [1,3,5,7,9]

    //     w1=[],w2=[3,5,7,9]
    //     w1=[1],w2=[5,7,9],
    //     w1=[1,3],w2=[7,9]
    //     w1=[1,3,5],w2=[9]
    //     w1=[1,3,5,7],w2=[]
    //     30
    }
}
