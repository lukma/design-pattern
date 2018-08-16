# Design Patterns

## Table of Contents

* [Behavioral Patterns](#behavioral)
	* [Strategy](#strategy)
	* [Observer](#observer)
	* [Template Method](#template-method)
	* [Iterator](#iterator)
	* [State](#state)
	* [Proxy](#proxy)
* [Creational Patterns](#creational)
	* [Factory Method](#factory-method)
	* [Abstract Factory](#abstract-factory)
	* [Singleton](#singleton)
* [Structural Patterns](#structural)
	* [Decorator](#decorator)
	* [Command](#command)
	* [Adapter](#adapter)
	* [Facade](#facade)
	* [Composite](#composite)

Behavioral
==========

>Behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

[Strategy](/src/main/kotlin/strategy)
-----------

Define family of algorithms, encapsulates each one and make them interchangeable. Strategy lets the algorithm vary independent from client that use it.

[Observer](/src/main/kotlin/observer)
--------

Define a one to many dependency between objects so that when one object change state, all its dependents are notified and updated automatically.

[Template Method](/src/main/kotlin/template-method)
--------

Define a skeleton of an algorithm in an operation, deferring some step of subclasses. Template method let's subclasses redefine certain steps of an algorithm without change algorithm structure.

[Iterator](/src/main/kotlin/iterator)
--------

Provide a way to access the element of an aggregate object sequentially without exposing underlying representation.

[State](/src/main/kotlin/state)
--------

Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

[Proxy](/src/main/kotlin/proxy)
--------

Provide a surrogate or placeholder for another object to control access to it.

Creational
==========
>Creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

[Factory Method](/src/main/kotlin/factory/factory)
--------

Define an interface for creating an object, but let subclass decide which class to instantiate. Factory method lets a class defer instantiation to the subclass.

[Abstract Factory](/src/main/kotlin/factory/abstractfactory)
--------

Provide an interface for creating families of related or dependent object without specifying their concrete class.

[Singleton](/src/main/kotlin/singleton)
--------

Ensure a class only has one instance and provide a global point of access to it.


Structural
==========

>Structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.

[Decorator](/src/main/kotlin/decorator)
--------

Attach additional responsibility to an object dynamically. Decorator provide a flexible alternative to subclassing for extending functionality.

[Command](/src/main/kotlin/command)
--------

Encapsulate a request as an object there be letting you parameterize client with different request, queue or log request and support undoable process.

[Adapter](/src/main/kotlin/adapter)
--------

Converts the interface of class into another interface clients expect. Lets class work together that couldn't otherwise because of incompatible interface.

[Facade](/src/main/kotlin/facade)
--------

Provide a unified interface to a set of interface in s subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

[Composite](/src/main/kotlin/composite)
--------

Compose object into tree structures to represent part-whole hierarchies. Composite lets clients threat individually objects and compositions of objects uniformly.

[Compound](/src/main/kotlin/compound)
--------

A compound pattern combines two or more patterns into solution that solves a recurring or general problem.