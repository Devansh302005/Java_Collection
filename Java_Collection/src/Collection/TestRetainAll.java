package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll {
	
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList();
		
		c1.add("Ram");
		c1.add(5);
		c1.add(5.2);
		c1.add('a');
		c1.add(true);
		
		System.out.println("Size of c1: " + c1.size());
		System.out.println(c1);
		
		System.out.println("----------------------");
		
		Collection c2 = new ArrayList();
		
		c2.add("Ram");
		c2.add('b');
		c2.add(false);
		c2.add('a');
		
		c1.retainAll(c2);
		System.out.println(c1);
				
	}

}
