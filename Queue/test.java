package Queue;

class qu{
	int arr[];
	int cap, size;
	qu(int n){
		arr = new int[n];
		cap = n;
		size=0;
	}
	boolean isFull() {	return size==cap;	}
	boolean isEmpty() {return size==0;}
	void enque(int d) {
		if(isFull())	return;
		arr[size] = d;
		size++;
	}
	void deque() {
		if(isEmpty())	return;
		for(int i=0;i<size;i++)
			arr[i] = arr[i+1];
		size--;
	}
	int size() {
		return size;
	}
	int peek() {
		if(isEmpty())	return -1;
		return arr[size-1];
	}
}
public class test {

	public static void main(String[] args) {
		qu q = new qu(4);
		q.enque(2);
		System.out.println(q.size());
		System.out.println(q.peek());
	}

}
