package JavaConstructorsAndAccessModifiers;

// Person Class
class Person {
    String name;
    int age;

    // Default Constructor
    public Person() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}
