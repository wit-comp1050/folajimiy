package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JCF {
	public static void main(String[] args) {
		final Collection<String> myCollection = new ArrayList<>();
		myCollection.add("Pineapple");
		myCollection.add("Banana");
		myCollection.add("Orange");
		myCollection.add("Apple");
		myCollection.add("Watermelon");
		
		
		final Iterator<String> i = myCollection.iterator();
		while(i.hasNext()) {
			System.out.printf("%s ", i.next().toUpperCase());
		}
		System.out.printf("- done!%n");


		final Iterator<String> c = myCollection.iterator();
		while(c.hasNext()) {
			final String str = c.next();
			if (str.toLowerCase().contains("an")) {
				System.out.printf("%s%n", str);
			}
		}
	}

}
