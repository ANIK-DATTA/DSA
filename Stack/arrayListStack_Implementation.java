package Stack;
import java.util.*;
class alStack {
	ArrayList<Integer> s = new ArrayList<>();
	void push(int x) {
		s.add(x);
	}
	int pop() {
		int res = s.get(s.size()-1);
		s.remove(s.size()-1);
		return res;
	}
	int peek() {
		int res = s.get(s.size()-1);
		return res;
	}
	int size() {
		return s.size();
	}
	boolean isEmpty() {
		return s.isEmpty();
	}
}

public class arrayListStack_Implementation {

	public static void main(String[] args) {
		alStack s = new alStack();
		s.push(5);
		s.push(10);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}

}
