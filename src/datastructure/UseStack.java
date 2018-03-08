package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> st = new Stack<String>();

		st.add("A");
		st.add("B");
		st.add("c");

		Iterator<String> it = st.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+ ", ");
		}
		System.out.println("\n");
		//=====push
		st.push("D");
		st.push("E");
		Iterator<String> it1 = st.iterator();
		while(it1.hasNext())
		{
			System.out.print(it1.next()+ ", ");
		}
		System.out.println("\n");
		System.out.println("List size is: "+ st.size());
		//pop
		System.out.println(st.pop());
		System.out.println("List size is: "+ st.size());
		//====peek
		System.out.println(st.peek());
	}

}
