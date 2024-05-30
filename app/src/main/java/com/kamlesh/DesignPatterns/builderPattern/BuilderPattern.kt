package com.kamlesh.DesignPatterns.builderPattern
/*

The Builder Pattern is a creational design pattern that allows you to construct complex objects step by step.
It separates the construction of an object from its representation so that the same construction process can create different representations.
The Builder pattern is useful when an object needs to be constructed in a multi-step process or when the construction involves several parameters.

Key Points:
Encapsulation: The construction process is encapsulated within the builder.
Flexibility: Different representations of an object can be created using the same construction process.
Immutability: The pattern often results in immutable objects, as the builder typically constructs the object in its final state.
Readability: The pattern enhances code readability by allowing you to see the steps of the construction process clearly.
Structure:
Product: The complex object that is being built.
Builder Interface: Defines the construction steps for creating the product.
Concrete Builder: Implements the construction steps defined in the Builder interface.
Director: (Optional) Manages the construction process. It uses the Builder interface to construct the product.
Client: Creates the Builder object and uses it to construct the product.
Example in Kotlin:
Step 1: Define the Product
Define a class for the product, which is a complex object with several attributes.

*/

data class House(
    val foundation: String,
    val structure: String,
    val roof: String,
    val interior: String
)
/*Step 2: Define the Builder Interface
Define an interface that outlines the steps required to build the product.*/


interface HouseBuilder {
    fun buildFoundation(): HouseBuilder
    fun buildStructure(): HouseBuilder
    fun buildRoof(): HouseBuilder
    fun buildInterior(): HouseBuilder
    fun build(): House
}
/*
Step 3: Implement the Concrete Builder
Implement the builder interface and provide the construction logic for each step.
*/


class ConcreteHouseBuilder : HouseBuilder {
    private lateinit var foundation: String
    private lateinit var structure: String
    private lateinit var roof: String
    private lateinit var interior: String

    override fun buildFoundation(): HouseBuilder {
        foundation = "Concrete, brick, and stone"
        return this
    }

    override fun buildStructure(): HouseBuilder {
        structure = "Concrete and steel"
        return this
    }

    override fun buildRoof(): HouseBuilder {
        roof = "Concrete and metal"
        return this
    }

    override fun buildInterior(): HouseBuilder {
        interior = "Drywall and paint"
        return this
    }

    override fun build(): House {
        return House(foundation, structure, roof, interior)
    }
}
/*
Step 4: Use the Builder
Use the builder to construct the product.
*/

fun main() {
    val houseBuilder = ConcreteHouseBuilder()
    val house = houseBuilder
        .buildFoundation()
        .buildStructure()
        .buildRoof()
        .buildInterior()
        .build()

    println(house)
}

/*

Explanation:
Product (House): The complex object to be built, which has several parts like foundation, structure, roof, and interior.
Builder Interface (HouseBuilder): Defines the methods for building different parts of the House.
Concrete Builder (ConcreteHouseBuilder): Implements the HouseBuilder interface and provides the logic to construct each part of the house.
Client: Uses the ConcreteHouseBuilder to construct a House step by step, ensuring that the construction process is flexible and readable.
Benefits:
Control over Construction Process: Allows you to construct an object step by step, ensuring each part is constructed correctly.
Encapsulation: Encapsulates the construction logic within the builder.
Flexibility: Can construct different variations of an object using the same process.
Readability and Maintainability: Makes the construction code more readable and maintainable.
The Builder pattern is particularly useful when creating complex objects with many optional parameters, where the process involves multiple steps or where different variations of the object need to be constructed in a controlled manner.*/
