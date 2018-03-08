package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> qu = new LinkedList<String>();
		qu.add("ab");
		qu.add("bc");
		qu.add("cd");
		qu.add("de");
		qu.add("ef");
		qu.add("fg");
		qu.add("gh");

		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu.peek());
		System.out.println(qu.remove());
		System.out.println(qu.peek());

		for (String countries:qu)
		{
			System.out.println(countries);
		}
		Iterator<String> it = qu.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ ", ");
		}

	}

}
