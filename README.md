@hicesse

---

# 📘 Object Oriented Programming Assignment

## Topic: Inheritance using `extends` and Superclass Methods

### 👤 Student Information

* Name: *Your Name*
* Course: Object Oriented & Visual Programming
* Instructor: *Instructor Name*
* Date: *Submission Date*

---

## 📌 Assignment Objective

The purpose of this assignment is to demonstrate:

1. The use of **inheritance** in Java.
2. Creating a subclass using the `extends` keyword.
3. Reusing attributes and methods from a superclass.
4. Writing well-structured and well-commented code.
5. Adding explanatory footnotes for better documentation.

---

## 🧠 Concept Overview

### 🔹 Inheritance

Inheritance allows a class (subclass) to acquire properties and behaviors from another class (superclass).
This promotes:

* Code reusability
* Logical hierarchy
* Cleaner structure

In Java, inheritance is implemented using the `extends` keyword.

```java
class SubClass extends SuperClass {
    // additional properties or methods
}
```

---

## 🏗️ Project Structure

This project consists of:

* `Hero.java` → Superclass
* `HeroINT.java` → Subclass (inherits from Hero)
* `Main.java` → Entry point of the program

---

## 🔎 Implementation Details

### 1️⃣ Superclass: `Hero`

The `Hero` class contains:

* Instance variables (such as name, health, etc.)
* Methods that define common behaviors
* Constructor for initialization

This class acts as the blueprint for all hero types.

---

### 2️⃣ Subclass: `HeroINT`

The `HeroINT` class:

* Uses `extends Hero`
* Inherits all accessible properties and methods from `Hero`
* May override or extend functionality
* May use `super()` to call superclass constructor

Example concept:

```java
class HeroINT extends Hero {
    public HeroINT(String name, int health) {
        super(name, health);
    }
}
```

This demonstrates:

* Calling superclass constructor using `super`
* Reusing logic instead of rewriting it

---

### 3️⃣ Main Class

The `Main` class:

* Creates object instances
* Demonstrates inherited behavior
* Executes methods from both superclass and subclass

---

## 📝 Code Documentation

The code includes:

✔ Well-structured comments explaining:

* Class purpose
* Method behavior
* Constructor usage
* Inheritance relationship

✔ Footnotes explaining:

* Why `extends` is used
* Why `super()` is necessary
* Access modifier behavior
* OOP design reasoning

---

## 🦶 Footnotes

1. `extends` allows subclass to inherit non-private members from superclass.
2. `super()` is used to call the constructor of the superclass.
3. Inheritance promotes code reuse and reduces duplication.
4. Overriding allows a subclass to provide its own implementation of a method.

---

## 🎯 Conclusion

This assignment successfully demonstrates:

* Proper use of inheritance
* Superclass and subclass relationship
* Constructor chaining using `super()`
* Clean documentation and structured comments
* Application of Object-Oriented Programming principles

The implementation follows Java OOP standards and emphasizes readability, maintainability, and reuse.

---


If your lecturer complains about formatting after this, that’s not about code anymore. That’s about vibes.

