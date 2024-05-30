package com.kamlesh.DesignPatterns.SingletonPattern

/*
The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance. This pattern is useful when exactly one object is needed to coordinate actions across the system.

Singleton Pattern in Java
In Java, there are several ways to implement the Singleton pattern. Here are a few common methods:

1. Eager Initialization
This method creates the instance at the time of class loading.
*/


// Java Singleton Implementation
/*public class Singleton {
    private static final Singleton instance = new Singleton();

    // Private constructor to prevent instantiation
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
2. Lazy Initialization
This method creates the instance when it is needed for the first time.

java
Copy code
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
3. Thread-Safe Singleton
This method ensures that the instance is created in a thread-safe manner.

java
Copy code
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
4. Double-Checked Locking
This method reduces the overhead of acquiring a lock by first checking if the instance is created.

java
Copy code
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
5. Bill Pugh Singleton Implementation
This method uses an inner static helper class to create the instance.

java
Copy code
public class Singleton {
    private Singleton() {}

    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}*/




/*
Singleton Pattern in Kotlin
Kotlin provides a more concise way to implement the Singleton pattern using the object keyword. Here’s how you can implement it in Kotlin:
*/
object Singleton {
    fun doSomething() {
        println("Singleton instance")
    }
}
/*

In Kotlin, the object declaration defines a Singleton. It is thread-safe and initialized lazily.

Comparison of Java and Kotlin Singleton Implementations
Java:
More boilerplate code is required.
Multiple ways to ensure thread safety.
Must handle synchronization explicitly.
Kotlin:
Simple and concise syntax with the object keyword.
Thread safety and lazy initialization are handled automatically.
Less boilerplate code compared to Java.
Usage
Regardless of the implementation, the usage of the Singleton in both Java and Kotlin remains straightforward.

Java Usage:



public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
Kotlin Usage:


fun main() {
    Singleton.doSomething()
}
Summary
The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
 In Java, you have various ways to implement it, ranging from eager initialization to the Bill Pugh method.
  In Kotlin, the implementation is simplified with the object keyword, providing a clean and concise way to achieve the Singleton pattern.*/
