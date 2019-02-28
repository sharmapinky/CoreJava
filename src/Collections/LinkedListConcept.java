package Collections;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(90);
		ll.add(100);
		ll.add(120);
		ll.add(130);
		System.out.println(ll);
		ll.addFirst(5);
		ll.addLast(150);
		System.out.println(ll.getLast());
		ll.removeLast();
		System.out.println(ll);
		

	}

}
