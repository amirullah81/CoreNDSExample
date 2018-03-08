package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		ArrayList<String> arl = new ArrayList<String>();

		arl.add("Bangladesh");
		arl.add("India");
		arl.add("Maldives");
		arl.add("Nepal");
		arl.add("Bhutan");
		arl.add("Srilanka");
		arl.add("Pakistan");

		for (String countries:arl)
		{
			System.out.println(countries);
		}
		Iterator<String> it = arl.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ ", ");
		}
	}

}
