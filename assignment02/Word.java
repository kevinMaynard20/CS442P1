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
		return null;
	}
	@Override
	public Set<Character> getVowelsInWord() {
		// return the set of characters in aeiou
		// which appear in thisWord
		// include y if thisWord is in Ywords.hasYvowel
		// you may find new words that have to be addes 
		// to the file yconsonant.txt
		return null;
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
