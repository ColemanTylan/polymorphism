

public class polymorphism {
    // Entry point to class public static void main
    public static void main(String[] args) {

        createAnimal(); // outputs 'animal sound'
        createBird(); // outputs 'chirp chirp'
        createCat(); // outputs 'meow'
    }

    //parent class
    public static class Animal {
        // method outputs generic animal sound
        public void sound() {
            System.out.println("animal sound!");
        }
    }
    // creating object createAnimal() to be called in main method
    public static void createAnimal() {
        //instantiating object using Animal class
        Animal animal = new Animal();
        // calls sound method created in Animal class
        animal.sound();
    }

    // Extending properties from Animal class for polymorphism and creating a Bird Subclass
    public static class Bird extends Animal {
        // Using @override to morph the output from sound() method to match bird sounds
        @Override
        public void sound() {
            System.out.println("chirp chirp");
        }
    }
    // Creating createBird() method to be called in main method
    public static void createBird() {
        Bird bird = new Bird();
        // This outputs 'chirp chirp' using polymorphism at compile time
        bird.sound();
    }
    // The same thing happens to the next Cat class and createCat() method
    public static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("meow");
        }
    }

    public static void createCat() {
        Cat cat = new Cat();
        cat.sound(); // cat sound
    }
}
//@Override annotation is used to override the methods in the subclass so the sound can be specific to the needs
//Using Polymorphism at runtime so the subclasses implementation of sound() method is outputted
