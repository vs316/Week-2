# Week 2: Object‑Oriented Java

Welcome to the Week 2 repository of our Java learning journey! This week dives into Java’s object‑oriented features—classes, objects, constructors, and the pillars of OOP.

## Table of Contents

1. [Overview](#overview)  
2. [Topics Covered](#topics-covered)  
   - [Day 1: Classes & Objects](#day-1-classes--objects)  
   - [Day 2: Constructors](#day-2-constructors)  
   - [Day 3: `static` & `final` Keywords](#day-3-static--final-keywords)  
   - [Day 4: OOP Principles](#day-4-oop-principles)  
   - [Day 5: Inheritance](#day-5-inheritance)  
   - [Day 6: Polymorphism, Interfaces & Abstract Classes](#day-6-polymorphism-interfaces--abstract-classes)  
3. [Prerequisites](#prerequisites)  
4. [Repository Structure](#repository-structure)  
5. [Getting Started](#getting-started)  
6. [Next Steps](#next-steps)  

---

## Overview

In Week 2, you’ll explore Java’s object‑oriented paradigm. You’ll learn how to define and use classes and objects, control object creation with constructors, understand class‑level vs. instance‑level modifiers, and apply core OOP concepts—encapsulation, abstraction, inheritance, and polymorphism. By the end of these six days, you’ll be equipped to design and implement robust, modular Java applications.

## Topics Covered

### Day 1: Classes & Objects
- **Defining a Class:** Syntax, fields, and methods.  
- **Creating Objects:** The `new` operator and reference variables.  
- **Access Modifiers:** `public`, `private`, `protected`, and package‑private.  
- **Encapsulation:** Getters, setters, and data hiding.

### Day 2: Constructors
- **Purpose:** Initialize new object instances.  
- **Default vs. Parameterized Constructors:** Overloading constructors.  
- **Constructor Chaining:** Using `this()` and `super()`.  
- **Best Practices:** Immutability and validation in constructors.

### Day 3: `static` & `final` Keywords
- **`static` Members:** Class variables and methods, and when to use them.  
- **`final` Variables:** Constants and blank finals.  
- **`final` Classes & Methods:** Preventing inheritance and method overriding.  
- **Common Patterns:** Utility classes, singleton implementation.

### Day 4: OOP Principles
- **Encapsulation:** Revisiting data hiding with example classes.  
- **Abstraction:** Abstract classes vs. interfaces.  
- **Inheritance:** “Is‑a” relationships and code reuse.  
- **Polymorphism:** Compile‑time vs. runtime polymorphism overview.

### Day 5: Inheritance
- **Extending Classes:** `extends` keyword and class hierarchies.  
- **Constructor Behavior in Inheritance:** Calling superclass constructors.  
- **`super` Keyword:** Accessing parent members.  
- **Overriding Methods:** Rules and the `@Override` annotation.

### Day 6: Polymorphism, Interfaces & Abstract Classes
- **Method Overloading vs. Overriding:** Signatures and binding.  
- **Interfaces:** Defining contracts, default and static methods (Java 8+).  
- **Abstract Classes:** When to use vs. interfaces.  
- **Design Patterns:** Strategy pattern demo using interfaces.

## Prerequisites

- **Completed Week 1** (Java syntax, data types, arrays, strings, methods).  
- **Java Development Kit (JDK) 8+** installed.  
- **IDE or Code Editor** (IntelliJ IDEA, Eclipse, or VS Code).

## Repository Structure

week-2-object-oriented-java/
├── Day1(JavaClassesAndObjects)/
│ └── L1/
│ └── ClassesObjectsDemo.java
├── Day2(JavaConstructors)/
│ └── L1/
│ └── ConstructorsDemo.java
├── Day3(static_final_keywords)/
│ └── L1/
│ └── StaticFinalDemo.java
├── Day4(OOPSPrinciples)/
│ └── L1/
│ └── OOPPrinciplesDemo.java
├── Day5(Inheritance)/
│ └── L1/
│ └── InheritanceDemo.java
└── Day6(Polymorphism_Interfaces_AbstractClasses)/
└── L1/
└── PolymorphismInterfacesAbstractDemo.java


Each `L1` folder contains sample code, notes, and exercises for that day’s lesson.

## Getting Started

1. **Clone this repository**  
   ```bash
   git clone https://github.com/yourusername/week-2-object-oriented-java.git
   cd week-2-object-oriented-java
2. **Compile and Run(Example)**
javac Day1(JavaClassesAndObjects)/L1/ClassesObjectsDemo.java
java -cp Day1(JavaClassesAndObjects)/L1 ClassesObjectsDemo
3. Explore & Experiment: Open each day’s L1 folder, review the code, and try extending the examples with your own classes and interfaces.
