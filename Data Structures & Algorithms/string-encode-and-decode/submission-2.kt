class Solution {

    fun encode(strs: List<String>): String {
        var sb = StringBuilder()
        for (str in strs) { 
            sb.append(str.length)
            sb.append(':')
            sb.append(str)
        }
        return sb.toString()
    }

    // str = 5:hello5:world7:kotlin:4::123
    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        val n = str.length
        var i = 0
        while (i < n) { 
            var delimiterPos = i
            while (delimiterPos < n && str[delimiterPos] != ':') { 
                delimiterPos++
            }
            val lengthStr = str.substring(i, delimiterPos)
            val length = lengthStr.toInt()
            delimiterPos += 1
            var actualStr = str.substring(delimiterPos, delimiterPos + length)
            result.add(actualStr)
            i = (delimiterPos + length)
        }
        return result
    }
}
