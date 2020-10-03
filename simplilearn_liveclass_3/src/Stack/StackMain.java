package Stack;

import java.util.Stack;

public class StackMain {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("**********Intial Stack Flow************");		
		System.out.println(stack);
		System.out.println("**********Pushing Elements in Stack Flow************");		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println("**********Poping Elements in Stack Flow************");	
		stack.pop();
		stack.pop();
		System.out.println(stack);
		System.out.println("**********Peek Element in Stack Flow************");	
		System.out.println(stack.peek());
		
		stack.add(2, 4);
		System.out.println(stack);





		


	}

}
