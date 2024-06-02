class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound(); // Outputs "Woof"
        b.makeSound(); // Outputs "Meow"
    }
}
