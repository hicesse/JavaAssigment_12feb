# 📘 Object Oriented Programming Assignment

## Topic: Inheritance and Object Interaction System

### 👤 Student Information

* Name: Your Name
* Course: Object Oriented & Visual Programming
* Instructor: Instructor Name
* Date: Submission Date

---

## 📌 Assignment Objective

This project demonstrates:

1. Implementation of **Inheritance** using `extends`
2. Use of **Superclass and Subclass**
3. Constructor chaining using `super()`
4. Object interaction between Hero and Weapon
5. Basic menu-driven game loop structure
6. Clean documentation and structured comments

---

## 🧠 OOP Concepts Applied

### 🔹 Inheritance

Inheritance allows a subclass to reuse attributes and methods from a superclass.

In this project:

* `Hero` → Superclass
* `HeroINT` → Subclass extending `Hero`

```java
class HeroINT extends Hero {
    public HeroINT(String name) {
        super(name);
    }
}
```

This ensures code reusability and structured hierarchy.

---

### 🔹 Constructor Chaining

The subclass constructor calls the superclass constructor using:

```java
super(name);
```

This guarantees proper initialization of inherited attributes.

---

### 🔹 Method Extension

The subclass `HeroINT` extends functionality by implementing:

* `equip(Weapon weapon)`
* Specialized attack calculations based on intelligence stat

This shows how subclass can add new behaviors beyond the parent class.

---

## 🏗️ Project Structure

* `Hero.java` → Base class containing core hero attributes and methods
* `HeroINT.java` → Intelligence-type hero extending Hero
* `Weapon.java` → Abstract/base weapon class
* `Sword.java` & `Shield.java` → Weapon implementations
* `Menu.java` → Menu interface handler
* `Main.java` → Program entry point with loop system

---

## 🎮 Program Flow

1. Program starts in `Main`
2. A `HeroINT` object is created
3. Weapons (Sword & Shield) are instantiated
4. Menu is displayed in a loop
5. User input determines:

   * Hero selection
   * Weapon equip
   * Display hero stats
   * Exit program

The loop continues until user selects exit option.

---

## 🔐 OOP Design Decisions

* Superclass contains shared hero logic
* Subclass specializes hero behavior
* Weapon system promotes modular design
* Menu logic separated from hero logic (Separation of Concerns)

---

## 🦶 Footnotes

1. `extends` allows inheritance of non-private members.
2. `super()` ensures parent constructor is executed first.
3. Casting is used when accessing subclass-specific methods.
4. Loop control must avoid unreachable statements.
5. Clean structure improves scalability for future features.

---

## 🎯 Conclusion

This project successfully demonstrates:

* Proper inheritance implementation
* Constructor chaining
* Method specialization
* Object collaboration
* Clean separation of logic

The design follows OOP principles and prepares the system for future expansion such as additional hero types, enemies, and combat mechanics.
