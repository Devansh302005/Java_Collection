package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestOfAllCollectionMethods {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add("Ram");
		c1.add(5);
		c1.add(5.2);
		c1.add('a');
		c1.add(true);
		
		System.out.println("size of c1: " + c1.size());
		System.out.println(c1);
		
		System.out.println("-------------------");
		
		Collection c2 = new ArrayList();
		
		c2.add("Sita");
		c2.add('b');
		c2.add(false);
			
		System.out.println("Size of c2: " + c2.size());
		System.out.println(c2);
		System.out.println("--------------------");
		System.out.println(c1.containsAll(c2));
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));
		System.out.println("Size of c1: " + c1.size());
		System.out.println(c1);
		c1.removeAll(c2);
		System.out.println(c1.containsAll(c2));
		
	}

}

