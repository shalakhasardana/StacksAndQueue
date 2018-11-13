
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
	int MAX_SIZE=3;
	Stack<Integer> astack;
	ArrayList<Stack> alist=new ArrayList<Stack>();
	
	public void pushIntoTheStacks(int item) {
		if(alist.isEmpty()|| alist.get(alist.size()-1).size()==MAX_SIZE) {
			astack=new Stack();
			astack.push(item);
			alist.add(astack);
		}else {
			alist.get(alist.size()-1).push(item);
		}
	}
	
	public int popFromTheStacks() {
		if(alist.isEmpty()) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int item=(int) alist.get(alist.size()-1).pop();
		if(alist.get(alist.size()-1).isEmpty()) {
			alist.remove(alist.get(alist.size()-1));
		}
		return item;
		
	}
	public int popAt(int index) {
		if(index<0 || index>=alist.size()) {
			System.out.println("You have enetered incorrect index number");
			return -1;
		}
		int item=(int) alist.get(index).pop();
		for(int i=index+1;i<alist.size();i++) {
			int data=(int) alist.get(i).remove(0);
			alist.get(i-1).push(data);
		}
		
		/*for (int i = index; i < stacks.size() - 1; ++i) {
            Stack<Integer> curr = stacks.get(i);
            Stack<Integer> next = stacks.get(i + 1);
            curr.push(next.remove(0));
        }*/
		if(alist.get(alist.size()-1).isEmpty()) {
			alist.remove(alist.get(alist.size()-1));
		}
		return item;
	}
	
	public static void main(String[] args) {
		StackOfPlates obj=new StackOfPlates();
		obj.pushIntoTheStacks(5);
		obj.pushIntoTheStacks(15);
		obj.pushIntoTheStacks(25);
		obj.pushIntoTheStacks(35);
		obj.pushIntoTheStacks(45);
		System.out.println(obj.popAt(10));
		System.out.println(obj.popAt(0));
		System.out.println(obj.popFromTheStacks());
		
	}

}
