package Stack;

class kstack{
	int arr[], top[], next[];
	int cap, k, freeTop;
	kstack(int k, int cap){
		this.k = k;	this.cap = cap;
		arr = new int[cap];
		top = new int[k];
		next = new int[cap];
		freeTop=0;
		for(int i=0;i<k;i++)
			top[i] = -1;
		
		for(int i=0;i<cap-1;i++)
			next[i] = i+1;
		next[cap-1] = -1;
			
	}
	void push(int x, int sn) {
		if(isFull()) {System.out.println("Overflow"); return;}
		int i = freeTop;
		freeTop = next[i];
		arr[i] = x;
		next[i] = top[sn];
		top[sn] = i;	
	}
	int pop(int sn) {
		if(isEmpty(sn)) {
			System.out.println("underflow"); 
			return Integer.MIN_VALUE;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = freeTop;
		freeTop = i;
		return arr[i];
	}
	boolean isFull() { return (freeTop==-1); }
	boolean isEmpty(int sn) { return (top[sn]==-1);  }
	
}

public class K_stack_in_array {
	public static void main(String[] args) {
		int k=3, n=10;
		kstack ks = new kstack(k,n);
		ks.push(15, 2);
		ks.push(45, 2); 
	       
        ks.push(17, 1); 
        ks.push(49, 1); 
        ks.push(39, 1); 
       
        ks.push(11, 0); 
        ks.push(9, 0); 
        ks.push(7, 0); 
        
        System.out.println("Popped element from stack 2 is " + ks.pop(2) ); 
        System.out.println("Popped element from stack 1 is " + ks.pop(1) ); 
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );   ;
	}

}
