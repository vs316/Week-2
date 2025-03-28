package Inheritance;

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog("Bouncer", 4);
        Cat cat = new Cat("Chichi", 3);
        Bird bird = new Bird("Chirpy", 2);

        System.out.print("Dog makes sound: ");
        dog.makeSound();

        System.out.print("Cat makes sound: ");
        cat.makeSound();

        System.out.print("Bird makes sound: ");
        bird.makeSound();
    }
}
