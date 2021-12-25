package Stack;

class arrayStack{
	int arr[];
	int cap;
	int top;
	
	arrayStack(int c){
		top=-1;
		cap=c;
		arr = new int[cap];
	}
	void push(int x) {
		if(top==cap-1) {
			System.out.println("Overflow");	return;
		}
		top++;
		arr[top] = x;
	}
	int peek() {
		if(top==-1) {
			System.out.println("Underflow"); 
			return -1;
		}
		int res = arr[top];
		return res;
	}
	int pop() {
		if(top==-1) {
			System.out.println("Underflow"); 
			return -1;
		}
		int res = arr[top];
		top--;
		return res;
	}
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return (top == -1);
	}
}


public class ArrayStack_Implementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayStack s = new arrayStack(5);
		s.push(10);
		System.out.println(s.peek());
		s.push(20);
		System.out.println(s.pop());
		
		}
}
