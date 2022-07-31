# Abstract Factory Pattern
Abstract Factory Pattern says that just **"define an interface or abstract class for creating families of related (or dependent) objects
but without specifying their concrete subclasses"**. That means that Abstract Factory lets a class return a factory of classes. So,
this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

An Abstract Factory Pattern is also known as  ***KIT***.
### Advantage of Abstract Factory Pattern:
* Abstract Factory Pattern isolates the client code from the concrete (implementation) classes.
* It eases the exchanging of object families.
* It promotes consistency among objects.
### Usage of Abstract Factory Pattern
* When the system needs to be independent of how it's objects are created, composed, and represented.
* When the family of related object has to be used together, then this constraint needs to be enforced.
* When you want to provide a library of objects that does not show implementations and only reveals interfaces.
* When the system needs to be configured with one of multiple family of objects.
### UML for Abstract Factory Pattern
<img src="abstractfactory.jpg">