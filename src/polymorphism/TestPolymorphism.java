package polymorphism;

import java.util.LinkedList;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("\n------Testing Animal object-------\n");
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        System.out.println("\n------Testing Dog object-------\n");
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();

        System.out.println("\n------Dog object in shape of Animal-------\n");
        Animal a2 = new Dog(); // up-casting
        a2.sleep();// Dog sleeps
        a2.eat(); // Dog eats
        a2.eat("food"); // Animal eats food
        //a2.bark(); // compiler error

    }
}
