**Primitive Data Types:**

1. **byte**

   - **Size:** 1 byte (8 bits)
   - **Range:** -128 to 127
2. **short**

   - **Size:** 2 bytes (16 bits)
   - **Range:** -32,768 to 32,767
3. **int**

   - **Size:** 4 bytes (32 bits)
   - **Range:** -2^31 to 2^31-1 (i.e., -2,147,483,648 to 2,147,483,647)
4. **long**

   - **Size:** 8 bytes (64 bits)
   - **Range:** -2^63 to 2^63-1 (i.e., -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
5. **float**

   - **Size:** 4 bytes (32 bits)
   - **Range:** Approximately ±3.40282347E+38F (7 significant decimal digits)
6. **double**

   - **Size:** 8 bytes (64 bits)
   - **Range:** Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
7. **char**

   - **Size:** 2 bytes (16 bits)
   - **Range:** 0 to 65,535 (Represents a single 16-bit Unicode character)
8. **boolean**

   - **Size:** 1 bit (Though the exact size is JVM dependent, it typically takes up 1 byte)
   - **Range:** `true` or `false`

**Non-Primitive Data Types:**

1. **Classes**

   - **Definition:** A class is a blueprint for creating objects (instances). It defines the properties (attributes) and behaviors (methods) that the objects created from the class will have.
   - **Example:**
     ```java
     class Car {
         String model;
         int year;

         void startEngine() {
             System.out.println("Engine started");
         }
     }
     ```
2. **Interfaces**

   - **Definition:** An interface in Java is an abstract type used to specify a behavior that classes must implement. Interfaces can contain abstract methods and default methods (with a body).
   - **Example:**
     ```java
     interface Animal {
         void eat();
     }

     class Dog implements Animal {
         public void eat() {
             System.out.println("Dog eats");
         }
     }
     ```
3. **Arrays**

   - **Definition:** An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.
   - **Example:**
     ```java
     int[] numbers = {1, 2, 3, 4, 5};
     String[] names = new String[5];
     ```
4. **Enums**

   - **Definition:** An enum (short for "enumeration") is a special "class" that represents a group of constants (unchangeable variables, like `final` variables). Enums are used to define collections of constants.
   - **Example:**
     ```java
     enum Day {
         SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
     }
     ```
5. **String**

   - **Definition:** The `String` class represents a sequence of characters. Strings in Java are immutable, meaning once created, they cannot be changed. `String` is a widely used class and provides many useful methods for string manipulation.
   - **Example:**
     ```java
     String greeting = "Hello, World!";
     int length = greeting.length();  // length is 13
     String upperCaseGreeting = greeting.toUpperCase();  // "HELLO, WORLD!"
     ```
