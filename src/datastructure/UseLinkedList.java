package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		LinkedList<String> saarc = new LinkedList<String>();

		//add
		saarc.add("Bangladesh");
		saarc.add("India");
		saarc.add("Maldives");
		saarc.add("Nepal");
		saarc.add("Bhutan");
		saarc.add("Srilanka");
		saarc.add("Pakistan");
		saarc.add("Myanmar");

		for (String countries:saarc)
		{
			System.out.println(countries);
		}
		//peek
		System.out.println(saarc.peek());
		//remove
		saarc.remove("Myanmar");
		Iterator<String> it = saarc.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
