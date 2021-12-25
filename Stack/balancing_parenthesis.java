package Stack;

import java.util.ArrayDeque;

public class balancing_parenthesis {
	static boolean isBalanced(String str) {
		   
        ArrayDeque<Character> s=new ArrayDeque<>(); 
        
        for (int i = 0; i < str.length(); i++)  
        { 
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')  
            {  
                s.push(str.charAt(i)); 
            } 
            else{
            if (s.isEmpty()==true) // if 1st char is closing bracket then return false or in this case: ()]
                return false;
            else if(matching(s.peek(),str.charAt(i))==false)
                return false;
            else
                s.pop();
            }
        }    
        return (s.isEmpty()==true); 
	}
	static boolean matching(char a, char b) {
		return ( (a=='(' && b==')') || 
				 (a=='{' && b=='}') || 
				 (a=='[' && b==']')	 );	
	}
	public static void main(String[] args) {
		String str = "{{}}[()]";
		System.out.print(str+" ");
		System.out.println("Is balanced? "+isBalanced(str));
		
	}

}
