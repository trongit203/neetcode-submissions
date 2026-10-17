class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(c in s) { 
            if(c == '(' || c == '{' || c == '[') { 
                stack.addLast(c)
            } else { 
                val currTop = stack.lastOrNull()
                if (c == ')' && currTop == '(') { 
                    stack.removeLast()
                } else if (c == '}' && currTop == '{') { 
                    stack.removeLast()
                } else if (c == ']' && currTop == '[') { 
                    stack.removeLast()
                } else { 
                    stack.addLast(c)
                }
            }
        }
        return stack.isEmpty()
    }
}
