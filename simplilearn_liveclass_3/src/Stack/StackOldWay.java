package Stack;

public class StackOldWay {
	
	private static final int MAX_SIZE = 5;
	private int top;
	private int arr[] = new int[MAX_SIZE];
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public StackOldWay(int top) {
		this.top = -1;
	}
	
	public boolean push(int value) {
		if(top >= MAX_SIZE-1){
			System.out.println("Stack is Overflow");
			return false;
		}else {
			arr[++top] = value;
			System.out.println("Value pushed to stack");
			return true;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOldWay stackOldWay = new StackOldWay(-1);
		stackOldWay.push(1);
		System.out.println();

	}

}
