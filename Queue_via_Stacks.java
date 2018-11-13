import java.util.Stack;

public class Queue_via_Stacks {
    static Stack<Integer> astack=new Stack<Integer>();
    public static void queuePush(int item) {
    	astack.push(item);
    }
    public Integer stackPop() {
    	if(astack.isEmpty()) {
    		System.out.println("Stack underflow");
    		return null;
    	}
    return astack.pop();
    
    }
    
    public static Integer queuePop() {
    	if(astack.isEmpty()) {
    		System.out.println("Stack underflow");
    		return null;
    	}
    	if(astack.size()==1) {
    		return astack.pop();
    	}
    	
    	int x=astack.pop();
    	int f=Queue_via_Stacks.queuePop();
    	queuePush(x);
       return f;
    
    }
    
public static void main(String[] args) {
		Queue_via_Stacks.queuePush(1);
		Queue_via_Stacks.queuePush(2);
		Queue_via_Stacks.queuePush(3);
		System.out.println(Queue_via_Stacks.queuePop());
		System.out.println(Queue_via_Stacks.queuePop());
		System.out.println(Queue_via_Stacks.queuePop());
		System.out.println(Queue_via_Stacks.queuePop());
		System.out.println(Queue_via_Stacks.queuePop());

	}
}
