class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal;  // Reference of type Animal

        animal = new Dog();  // Upcasting: Dog is treated as an Animal
        animal.sound();      // Calls Dog's version of sound()

        animal = new Cat();  // Upcasting: Cat is treated as an Animal
        animal.sound();      // Calls Cat's version of sound()
    }
}
