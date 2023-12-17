package com.designpatterns.behavioral.iterator_pattern;

public class IteratorPatternDemo {

    public static void main(String[] args) {
        CollectionOfNames collectionOfNames = new CollectionOfNames();

        for (Iterator iterator = collectionOfNames.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name >> " + name);
        }
    }
}
