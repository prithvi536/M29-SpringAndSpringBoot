package org.tnsif.autowiremodes;

public class TextEditor {
	//DI in the form of objects
	private SpellChecker checker;
	
	//DI using constructor
	public TextEditor(SpellChecker checker) {
		super();
		this.checker = checker;
		System.out.println("DI using constructor");
	}

	//getters and setters
	public SpellChecker getChecker() {
		return checker;
	}

	public void setChecker(SpellChecker checker) {
		this.checker = checker;
	}
	
	public void display() {
		checker.checkSpelling();
	}

	
	
}
