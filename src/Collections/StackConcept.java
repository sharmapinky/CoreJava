package Collections;

import java.util.Stack;

public class StackConcept {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push("SELENIUM");
		s.push(50);
		s.push(10);
	boolean b=	s.isEmpty();
	System.out.println(b);
	System.out.println(s.search("SELENIUM"));
	System.out.println(s.peek());
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s);
	
	}

}
