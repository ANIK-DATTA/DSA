package Queue;
class effArQueue{
	int arr[];
	int front, cap, size;
	effArQueue(int n){
		cap =n;
		arr = new int[cap];
		front = 0;	size=0;
	}
	boolean isFull() {return cap==size;}
	boolean isEmpty() {return size==0;}
	int getFront() {
		if(isEmpty())	return -1;
		else	return front;
	}
	int getRear() {
		if(isEmpty())	return -1;
		return (front+size-1)%cap;
	}
	void enque(int x) {
		if(isFull())	return;
		int rear = getRear();
		rear = (rear+1)%cap;
		arr[rear] = x;
		size++;
	}
	void deque() {
		if(isEmpty())	return;
		front = (front+1)%cap;
		size--;
	}
}
public class eff_Circular_Array_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
