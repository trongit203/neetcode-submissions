class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val freq = IntArray(26)
        for (char in s) { 
            freq[char.code - 97]++
        }
        for(char in t) { 
            freq[char.code - 97]--
        }
        for (i in 0 until freq.size) { 
            if (freq[i] != 0)
                return false
        }
        return true
    }
}
