import java.util.Stack;

public class SortTheStack {
Stack<Integer> sorted=new Stack<Integer>();
Stack<Integer> temp=new Stack<Integer>();
	public void push(int item) {
	if(sorted.isEmpty()) {
		sorted.push(item);
	}else if(item>=sorted.peek()) {
		sorted.push(item);
	}else {
		int count=0;
		while(!sorted.empty() &&item<sorted.peek()) {
			temp.push(sorted.pop());
			count++;
		}
		sorted.push(item);
		while(!temp.isEmpty() &&count>0) {
			sorted.push(temp.pop());
		}
	}
	}
	
	public void getItemsInSortedOrder() {
		if(sorted.isEmpty()) {
			return;
		}
		
		while(!sorted.empty()) {
			System.out.println(sorted.pop());
		}
	}
	
	public static void main(String[] args) {
		SortTheStack temp=new SortTheStack();
		temp.push(34);
		temp.push(3);
		temp.push(31);
		temp.push(98);
		temp.push(92);
		temp.push(23);
		temp.getItemsInSortedOrder();
	}
}
