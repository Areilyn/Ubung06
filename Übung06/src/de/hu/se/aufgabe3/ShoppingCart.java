package de.hu.se.aufgabe3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShoppingCart {

	private Collection<ShoppingItem> items = new ArrayList<ShoppingItem>();
	
	public void addItem(ShoppingItem item) {
		items.add(item);
	}
	
	public Collection<ShoppingItem> getItems(){
		return Collections.unmodifiableCollection(items);
}
}