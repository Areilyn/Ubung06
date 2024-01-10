package de.hu.se.aufgabe1;

public class CollectionAdapter implements CollectionIterator {

    CollectionImpl coll;

    public CollectionAdapter(CollectionImpl c) {
        coll = c;
    }

    @Override
    public boolean hasNext() {
        return coll.hasMoreElements();
    }

    @Override
    public String next() {
        return coll.nextElement();
    }
}
