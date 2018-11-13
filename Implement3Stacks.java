
public class Implement3Stacks {
	int NumberOfStacks=0;
	int Available=0;
	int[] Top;
	int[] Array;
	int[] NextAvialable;
	Implement3Stacks(int numberOfStacks,int array_Size){
		NumberOfStacks=numberOfStacks;
		Top=new int[NumberOfStacks];
		Array=new int[array_Size];
		NextAvialable=new int[array_Size];
		for(int i=0;i<array_Size-1;i++) {
			NextAvialable[i]=i+1;
		}
		NextAvialable[array_Size-1]=-1;
		
	}
	public void push(int item,int index) {
		if(index<0 || index>=NumberOfStacks) {
			System.out.println("Stack number is invalid");
			return;
		}
		if(Available==-1) {
			System.out.println("StackOverflow");
			return;
		}
		int arrayTop=Top[index];
		int nextAvail=NextAvialable[Available];
		int prevAvailable=Available;
		Top[index]=Available;
		Array[prevAvailable]=item;
		Available=NextAvialable[prevAvailable];
		NextAvialable[prevAvailable]=arrayTop;
	}
	
	public Integer pop(int index) {
		if(index<0 || index>=NumberOfStacks) {
			System.out.println("Stack number is invalid");
			return -1;
		}
		if(Top[index]==-1) {
			System.out.println("StackUnderflow");
			return -1;
		}
	    int j=Top[index];
	    int k=Available;
	    int f=NextAvialable[j];
	    int item=Array[j];
	    Available=j;
	    NextAvialable[j]=k;
	    Top[index]=f;
		return item;
		
	}
	public static void main(String[] args) {
		int n=10;
		int k=3;
		Implement3Stacks ks=new Implement3Stacks(k,n);
		ks.push(15, 2); 
        ks.push(45, 2); 
  
        // Let us put some items in stack number 1 
        ks.push(17, 1); 
        ks.push(49, 1); 
        ks.push(39, 1); 
  
        // Let us put some items in stack number 0 
        ks.push(11, 0); 
        ks.push(9, 0); 
        ks.push(7, 0); 
  
        System.out.println("Popped element from stack 2 is " + ks.pop(2)); 
        System.out.println("Popped element from stack 1 is " + ks.pop(1)); 
        System.out.println("Popped element from stack 0 is " + ks.pop(0)); 
		
	}

}
