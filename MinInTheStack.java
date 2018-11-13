import java.util.Stack;

public class MinInTheStack {
	Stack<Integer> stack=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	public boolean isEmpty() {
		return stack.empty();
	}
	public void push(int item) {
		if(stack.isEmpty()) {
			stack.push(item);
			min.push(item);
		}
		
		if(item>=min.peek()) {
			stack.push(item);
			min.push(min.peek());
		}else {
			stack.push(item);
			min.push(item);
		}
	}
	public int pop() {
		min.pop();
		return stack.pop();
		
	}

	public int min() {
		return min.peek();
	}
	public static void main(String[] args) {
		MinInTheStack obj=new MinInTheStack();
		obj.push(18);
		obj.push(19);
		obj.push(29);
		obj.push(15);
		obj.push(16);
		System.out.println(obj.min());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.min());
	}
}
