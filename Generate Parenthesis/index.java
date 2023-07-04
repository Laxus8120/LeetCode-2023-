import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", 0, 0, n, new Stack<>(), result);
        return result;
    }
    
    private void generateParenthesisHelper(String combination, int openCount, int closeCount, int n, Stack<Character> stack, List<String> result) {
        if (openCount == n && closeCount == n) {
            result.add(combination);
            return;
        }
        
        if (openCount < n) {
            stack.push('(');
            generateParenthesisHelper(combination + "(", openCount + 1, closeCount, n, stack, result);
            stack.pop();
        }
        
        if (closeCount < openCount) {
            stack.pop();
            generateParenthesisHelper(combination + ")", openCount, closeCount + 1, n, stack, result);
            stack.push('(');
        }
    }
}