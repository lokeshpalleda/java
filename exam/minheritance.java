class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy is weeping.");
    }
}
public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat(); 
        puppy.bark(); 
        puppy.weep(); 
    }
}
