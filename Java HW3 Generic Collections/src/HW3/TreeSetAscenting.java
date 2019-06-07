package HW3;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetAscenting {
	
	   public static void main(String[] args) {
			
		   String input="Welcome to Java Session Session Session"; 		//Input String
			input = input.toLowerCase();  //String tolowercase
			input = input.replaceAll("\\p{Punct}", "");  //Ingore punctuations
			String[] words=input.split(" ");	//Split the word from String
			
	        // Creating a TreeSet with a custom Comparator (Case Insensitive Order)
	        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	        /*
	            The above TreeSet with the custom Comparator is the concise form of the following:
	            SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
	                @Override
	                public int compare(String s1, String s2) {
	                    return s1.compareToIgnoreCase(s2);
	                }
	            });
	        */
	        for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
			{
	        // Adding new elements to a TreeSet
	        fruits.add(words[i]);

			}
	        System.out.println("Original sentence : " + input);
	        System.out.println("Words Set : " + fruits);

	    }

}
