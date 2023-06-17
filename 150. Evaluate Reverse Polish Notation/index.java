class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String operator  = "+*/-";

        for(String n : tokens){
            if(!operator.contains(n)){
                s.push(Integer.parseInt(n));
            }
            else{
                int operand2 = s.pop();
                int operand1 = s.pop();
                int result = 0;
                switch(n){
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        // Perform integer division (truncate toward zero)
                        result = operand1 / operand2;
                        break;
                }
                s.push(result);
            }
        }
       return s.pop();
    }
}