package string.problems;

import java.util.*;
import java.util.Map.Entry;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> stMap = new HashMap<String, Integer>();
        int count=0;
        int dot = 0;
        int space = 0;
        for(String abc : st.split(" "))
        {
        if(stMap.get(abc)== null)
            stMap.put(abc, 1);
        else
            stMap.put(abc, stMap.get(abc) +1);
            count++;
        }
        System.out.print("Each word appair in how many time is as follow: " + "\n");
        for (Entry<String, Integer> fer:stMap.entrySet())
        {
            System.out.println(fer.getKey()+" = "+fer.getValue());
        }
        for (int i=0; i<st.length();++i)
        {
            char charAt = st.charAt(i);
            switch (charAt)
            {
                case '.':
                    dot++;
                    break;
                case ' ':
                    space++;
                    break;
            }

        }
        System.out.println("average length of the words: "+ (st.length()-(dot+space))/count);
    }

}
