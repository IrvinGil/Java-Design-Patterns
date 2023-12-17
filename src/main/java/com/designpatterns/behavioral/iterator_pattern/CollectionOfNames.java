package com.designpatterns.behavioral.iterator_pattern;

public class CollectionOfNames implements Container {
    public String[] names = {"Ashwani Rajput", "Soono Jaiswal", "Rishi Kumar", "Rahul Mehta"};

    @Override
    public Iterator getIterator() {
        return new CollectionOfNamesIterate();
    }

    private class CollectionOfNamesIterate implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            return this.hasNext() ? names[index++] : null;
        }
    }
}

