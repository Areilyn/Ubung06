package de.hu.se.aufgabe1;

public class Client {

	public static void main(String[] args) {
		CollectionImpl c = new CollectionImpl(new String[]{"elem1", "elem2"});
		
		// We can directly use the class CollectionImpl to list all elements 
		// but we want to use the UI!
	
		// UI is expecting a CollectionIterator. 
		// TODO How can we use a CollectionImpl object in the UI?
		CollectionIterator collectionIterator = new CollectionAdapter(c);
		
		CollectionUI ui = new CollectionUI();
		ui.showCollection(collectionIterator);
	}
}