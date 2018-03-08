package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


			List<String> alphabetA = new ArrayList<String>();
			alphabetA.add("abase");
			alphabetA.add("aberration");
			alphabetA.add("abhor");
			alphabetA.add("abject");

			List<String> alphabetB = new ArrayList<String>();
			alphabetB.add("baby");
			alphabetB.add("back");
			alphabetB.add("backgroung");
			alphabetB.add("bag");

			List<String> alphabetC = new ArrayList<String>();
			alphabetC.add("cat");
			alphabetC.add("catch");
			alphabetC.add("copy");
			alphabetC.add("candy");

			List<String> alphabetD = new ArrayList<String>();
			alphabetD.add("dog");
			alphabetD.add("dance");
			alphabetD.add("daily");
			alphabetD.add("danger");

			Map<String, List<String>> word = new LinkedHashMap<String, List<String>>();

			word.put("a", alphabetA);
			word.put("b", alphabetB);
			word.put("c", alphabetC);
			word.put("d", alphabetD);

			for (Map.Entry<String, List<String>> allword : word.entrySet()) {
				System.out.println("Alphabet(Key): " + allword.getKey() + " Word(Value): " + allword.getValue());
			}

		}


}