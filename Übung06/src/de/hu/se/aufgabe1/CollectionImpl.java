package de.hu.se.aufgabe1;

public class CollectionImpl {
	
	private String[] elements;
	private int index = 0;
	
	public CollectionImpl(String[] elements) {
		this.elements = elements;
	}
	
    public boolean hasMoreElements() {
    	return this.index < this.elements.length;
    }

    public String nextElement() {
    	String elem = this.elements[this.index];
    	this.index++;
    	return elem;
    }

}
