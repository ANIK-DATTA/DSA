package Queue;
class QueueAr{
	int size, cap;
	int arr[];
	QueueAr(int c){
		cap = c;
		size=0;
		arr = new int[cap];
	}
	boolean isFull() {return size==cap;}
	boolean isEmpty() {return size==0;}
	void enque(int x) {
		if(isFull()) return;
		arr[size] = x;
		size++;
	}
	void deque() {
		if(isEmpty())	return;
		for(int i=0;i<size-1;i++)
			arr[i] = arr[i+1];
		size--;
	}
	int getFront() {
		if(isEmpty())	return -1;
		else	return 0;
	}
	int getRear() {
		if(isEmpty()) return -1;
		else return size-1;
	}
}
public class Array_Implementation {
	
	public static void main(String[] args) {
		
	}

}
