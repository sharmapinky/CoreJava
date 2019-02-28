package Collections;

import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement(1);
		v.addElement(100);
	
		System.out.println(v.capacity());
		Iterator it=v.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	for(int i=0;i<v.size();i++){
		System.out.println(v.get(i));
	}
			
	}		
}
