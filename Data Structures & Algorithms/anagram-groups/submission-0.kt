class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableListOf<List<String>>()
    val map = mutableMapOf<String, MutableList<String>>()
    for (str in strs) {
    	val freq = IntArray(26)
        for(c in str) { 
        	freq[c.code - 97]++
        }
        var keyGen: String = ""
        for(i in 0 until freq.size) { 
        	if(freq[i] > 0) { 
            	val freqStr = ((i + 97).toChar() + "_" + freq[i]).toString()
                keyGen+= freqStr
            }
        }
        map.getOrPut(keyGen) { mutableListOf<String>() }.add(str)
    }

    return map.values.toList()
    }
}
