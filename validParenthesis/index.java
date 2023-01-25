/*
 * Question - Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

 * 
 * TimeComplexity --> O(n) // n = size of String 
 * SpaceComplexity --> O(n) // we using stack which use the length equal to the string.
 */
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();

        for(int i =0;i<s.length();i++){

            if(stk.isEmpty()&&(s.charAt(i) == ')' ||s.charAt(i) == '}' ||s.charAt(i) == ']'))
            {
                return false;
            }
            else
            {
                if(!stk.isEmpty()){
                    if(stk.peek()=='(' && s.charAt(i) == ')') stk.pop();
                    else if(stk.peek()=='{' && s.charAt(i) == '}') stk.pop();
                    else if(stk.peek()=='[' && s.charAt(i) == ']') stk.pop();
                    else stk.push(s.charAt(i));
                }

                else stk.push(s.charAt(i));
            }
        }

        return stk.isEmpty();
    }
}