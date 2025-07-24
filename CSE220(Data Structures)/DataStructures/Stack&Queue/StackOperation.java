

public class StackOperation {
    // Reverse
    public static LinkedListStack reverseStack(LinkedListStack stack){
        LinkedListStack tempStack=new LinkedListStack();
        while(!stack.isEmpty()){
            tempStack.push(stack.pop());
        }
        return tempStack;
    }

    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression){
        LinkedListStack stack=new LinkedListStack();
        for(char ch:expression.toCharArray()){
            if(Character.isDigit(ch)) stack.push(ch-'0');
            else{
                int operand2=stack.pop();
                int operand1=stack.pop();
                switch(ch){
                    case '+':
                        stack.push(operand1+operand2);
                        break;
                    case '-':
                        stack.push(operand1-operand2);
                        break;
                    case '*':
                        stack.push(operand1*operand2);
                        break;
                    case '/':
                        stack.push(operand1/operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    // Method to check if parentheses are balanced
    public static boolean isBalancedParentheses(String expr){
        LinkedListStack stack=new LinkedListStack();
        for(char ch:expr.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()) return false;
                char top=(char)stack.pop();
                if(ch==')'&&top!='('||ch=='}'&&top!='{'||ch==']'&&top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}
