package Stack;
class twoStack{
	int arr[], top1, top2, size;	
	twoStack(int cap){
		size=cap;
		top1=-1;
		top2 = cap;
		arr = new int[cap];
	}
	void push1(int data) {
		if(top1<top2-1) {
			top1++;
			arr[top1] = data;
		}
		else	
			System.out.println("Overflow stack1");
	}
	void push2(int data) {
		if(top1<top2-1) {
			top2--;
			arr[top2] = data;
		}
		else 
			System.out.println("Overflow stack2");
	}
	int pop1() {
		if(top1<0) {
			System.out.println("Underflow stack1");
			return Integer.MIN_VALUE;
		}
		int res = arr[top1];
		top1--;
		return res;
	}
	int pop2() {
		if(top2>size-1) {
			System.out.println("underflow stack2");
			return Integer.MIN_VALUE;
		}
		int res=arr[top2];
		top2++;
		return res;
	}
	int size1() {
		return top1+1;
	}
	int size2() {
		return size-top2;
	}
	int peek1() {
		if(top1<0) {
			System.out.println("Underflow stack1");
			return Integer.MIN_VALUE;
		}
		return arr[top1];
	}
	int peek2() {
		if(top2>size-1) {
			System.out.println("Underflow stack1");
			return Integer.MIN_VALUE;
		}
		return arr[top2];
	}
	boolean isEmpty1() {
		return top1==-1;
	}
	boolean isEmpty2() {
		return top2==size;
	}
}

public class Two_Stacks_in_Array {
	public static void main(String[] args) {
		twoStack s = new twoStack(5);
		s.push1(2);
		System.out.println(s.peek1());
		System.out.println(s.isEmpty1());
	}
}
