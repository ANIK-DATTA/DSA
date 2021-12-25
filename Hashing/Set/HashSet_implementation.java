package Hashing.Set;
import java.util.*;
public class HashSet_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set = new HashSet <String>();
		set.add("Hello");
		set.add("World");
		set.add("Hello");
		set.add("!");
		System.out.println(set);
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		Iterator <String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set.remove("!"));
		System.out.println(set.contains("!"));
		set.clear();
		System.out.println(set);
	}

}
