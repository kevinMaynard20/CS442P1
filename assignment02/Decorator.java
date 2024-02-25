package assignment02;

import java.util.Set;

public abstract class Decorator extends Component {
	private Component delegate;
	
	public Decorator(Component delegateIn) {
		delegate = delegateIn;
	}

	public abstract Set<Character> getConsonantsInWord();
	public abstract Set<Character> getVowelsInWord();	
	
	@Override
	public Set<Character> getConsonants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Set<Character>> getVowels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		delegate.print();
	}}
