package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionForEachLoop {
	public static void main(String[] args) {
			
		Collection c1 = new ArrayList();
		
		c1.add("Ram");
		c1.add(5);
		c1.add(5.2);
		c1.add('a');
		c1.add(true);
		
		System.out.println("Size of c1: " + c1.size());
		System.out.println(c1);
		
		System.out.println("-------------");
		
		for (Object o: c1) {
			System.out.println(o);
		}

	}

}
