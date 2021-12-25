package Hashing.Map;
import java.util.*;
public class HashMap_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> hm = new HashMap<String, Integer>();
		hm.put("abc",2);
		hm.put("pqr",4);

		hm.put("xyz", 11);
		System.out.println(hm);
		System.out.println(hm.size());
		for(Map.Entry<String, Integer> m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(hm.containsKey("ab"));
		System.out.println(hm.containsValue(2));
		hm.remove("pqr");
		for(Map.Entry<String, Integer> m: hm.entrySet()) {
			
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}

}
