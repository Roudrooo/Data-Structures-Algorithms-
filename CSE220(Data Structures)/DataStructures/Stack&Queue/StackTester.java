
public class StackTester {
    public static void main(String[] args){
        LinkedListStack stack=new LinkedListStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();
        System.out.println("Top element: "+stack.peek());
        System.out.println("Popped: "+stack.pop());
        stack.displayStack();
        System.out.println("Is stack empty? "+stack.isEmpty());
        stack.pop();
        stack.pop();
        System.out.println("Is stack empty? "+stack.isEmpty());

        // Reverse
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();
        LinkedListStack revStack = StackOperation.reverseStack(stack);
        System.out.println("Reversed Stack:");
        revStack.displayStack();

        // Method to evaluate a postfix expression
        String postfixExpression = "53+82-*";
        int result=StackOperation.evaluatePostfix(postfixExpression);
        System.out.println("Postfix Evaluation Result: " + result);

        // Method to check if parentheses are balanced
        String expr1="{[()]}",expr2="{[(])}";
        System.out.println("Is Balanced? "+StackOperation.isBalancedParentheses(expr1));
        System.out.println("Is Balanced? "+StackOperation.isBalancedParentheses(expr2));
    }
}
