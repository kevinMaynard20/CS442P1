package assignment02;

import java.util.Set;

public class Word extends Decorator {
	private String thisWord;
	public Word(Component delegate, String str) {
		super(delegate);
		thisWord = str;
	}
	
	@Override
	public Set<Character> getConsonantsInWord() {
		// return the set of characters in bcdfghjklmnpqrstvwxz 
		// which appear in thisWord
		// include y if thisWord is in Ywords.hasYconsonant
		// you may find new words that have to be addes 
		// to the file yconsonant.txt
		
		
		Set<Character> consonants = Set.of(
   		 'b', 'c', 'd', 'f', 'g', 
    		 'h', 'j', 'k', 'l', 'm', 
   		 'n', 'p', 'q', 'r', 's', 
  		 't', 'v', 'w', 'x', 'z');

		String temp = thisWord.toLowerCase();
		 if (assignment02.Ywords.hasYconsonant.contains(temp)) {
         		consonants = new HashSet<>(consonants); // Convert to mutable set if using Set.of
            		consonants.add('y');
        	}
		
		Set<Character> overlap = new HashSet<>();

		for (int i = 0; i < temp.length(); i++) {
            		char ch = temp.charAt(i);
           	 if (consonants.contains(ch)) 
		 	{
               		 overlap.add(ch);
            		}
      		}
		
		return overlap;
	}
	@Override
	public Set<Character> getVowelsInWord() {
		// return the set of characters in aeiou
		// which appear in thisWord
		// include y if thisWord is in Ywords.hasYvowel
		// you may find new words that have to be addes 
		// to the file yconsonant.txt
		
		
		Set<Character> vowels = Set.of(
   		 'a', 'e', 'i', 'o', 'u');
		String temp = thisWord.toLowerCase();
		 if (assignment02.Ywords.hasYvowel.contains(temp)) {
         		vowels = new HashSet<>(vowels); // Convert to mutable set if using Set.of
            		vowels.add('y');
        	}

		
		Set<Character> overlap = new HashSet<>();

		for (int i = 0; i < temp.length(); i++) {
            		char ch = temp.charAt(i);
           	 if (vowels.contains(ch)) 
		 	{
               		 overlap.add(ch);
            		}
      		}
		
		return overlap;
	}

	@Override
	public String toString() {
		return thisWord;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.print("->" + this);
	}
}
