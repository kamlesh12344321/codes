package com.kamlesh.DesignPatterns.factoryMethodPattern



/*
* The Factory Method is a creational design pattern that provides an interface for creating objects in a superclass,
*  but allows subclasses to alter the type of objects that will be created.
* Instead of calling a constructor directly to create an object,
*  the client calls a factory method which encapsulates the creation logic and returns the object.
* This pattern promotes loose coupling and adherence to the Open/Closed Principle by allowing the creation process to be extended without modifying existing code.

Key Points:
Encapsulation: The creation logic is encapsulated in the factory method, not exposed to the client.
Polymorphism: It leverages polymorphism to delegate the instantiation process to subclasses.
Flexibility: Subclasses can override the factory method to create specific types of objects, allowing the system to be extended with new types without altering existing code.
Decoupling: It decouples the client code from the specific classes it needs to instantiate.
Structure:
Product Interface: Defines the interface or abstract class for the type of object that the factory method creates.
Concrete Products: Implementations of the Product interface.
Creator Class: An abstract class or interface that declares the factory method.
Concrete Creators: Subclasses that implement the factory method to instantiate specific concrete products.*/
interface Transport {
    fun deliver()
}

class Car : Transport {
    override fun deliver() {
        println("delivering by car")
    }

}


// Bike delevery class
class Bike : Transport {
    override fun deliver() {
        println("delivering by bike")
    }

}

// Define factory interface

abstract class TransportFactory {
    abstract fun createTransport(): Transport

    fun planDelivery(){
        val transport = createTransport()
        transport.deliver()
    }
}


// Concrete factory for all type of transport

class CarFactory: TransportFactory() {
    override fun createTransport(): Transport {
        return Car()
    }

}

class BikeFactory : TransportFactory() {
    override fun createTransport(): Transport {
        return Bike()
    }

}

fun main() {
    val carFactory = CarFactory()
    carFactory.planDelivery()

    val bikeFactory = BikeFactory()
    bikeFactory.planDelivery()
}

