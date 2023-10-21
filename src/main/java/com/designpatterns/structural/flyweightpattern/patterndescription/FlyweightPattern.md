# Flyweight Pattern
Flyweight is a structural design pattern that allows programs to support vast quantities of objects by keeping their memory consumption low. The pattern achieves it by sharing parts of object state between multiple objects. In other words, the Flyweight saves RAM by caching the same data used by different objects.

A Flyweight Pattern says that just "**to reuse already existing similar kind of objects by storing them and create new object when no matching object is found**".

### Advantages of Flyweight Pattern
- It reduces the number of objects.
- It reduces the amount of memory and storage devices required if the objects are persisted

### Usage of Flyweight Pattern
- When an application uses number of objects
- When the storage cost is high because of the quantity of objects.
- When the application does not depend on object identity.

#### Examples
The Flyweight pattern has a single purpose: minimizing memory intake. If your program doesn’t struggle with a shortage of RAM, then you might just ignore this pattern for a while.

Flyweight can be recognized by a creation method that returns cached objects instead of creating new.

### Demo
#### Rendering a forest
In this example, we’re going to render a forest (1.000.000 trees)! Each tree will be represented by its own object that has some state (coordinates, texture and so on). Although the program does its primary job, naturally, it consumes a lot of RAM.

The reason is simple: too many tree objects contain duplicate data (name, texture, color). That’s why we can apply the Flyweight pattern and store these values inside separate flyweight objects (the `TreeType` class). Now, instead of storing the same data in thousands of `Tree` objects, we’re going to reference one of the flyweight objects with a particular set of values.

The client code isn’t going to notice anything since the complexity of reusing flyweight objects is buried inside a flyweight factory.
