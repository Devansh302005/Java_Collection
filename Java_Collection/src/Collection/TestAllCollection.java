package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestAllCollection {
	
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Ram");
		c.add(5);
		c.add(5.2);
		c.add('a');
		c.add(true);
		
		System.out.println("Size of c: " + c.size());
		System.out.println(c);
		System.out.println(c.contains("Ram"));
		System.out.println(c.remove("Ram"));
		System.out.println(c);
		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c.isEmpty());
		
	}

}

