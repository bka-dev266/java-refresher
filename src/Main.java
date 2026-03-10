//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create Dog and Cat objects using constructors
        Dog joy = new Dog("", 0, "");
        Cat whiskers = new Cat("", 0, "");

        // Use setters to assign values to attributes
        joy.setName("Joy");
        joy.setAge(3);
        joy.setBreed("Labrador");

        whiskers.setName("Whiskers");
        whiskers.setAge(2);
        whiskers.setColor("Orange");

        // Demonstrate Dog object
        // Call both versions of makeSound method
        joy.makeSound();                    // No parameters - prints "Bark"
        joy.makeSound("Woof Woof");         // With parameter - prints custom sound

        // Display attributes using getters
        System.out.println("Name: " + joy.getName() + ", Age: " + joy.getAge() + ", Breed: " + joy.getBreed());

        // Call showAffection from Pet interface
        joy.showAffection();

        // Demonstrate Cat object
        // Call both versions of makeSound method
        whiskers.makeSound();               // No parameters - prints "Meow"
        whiskers.makeSound("Meow Meow");    // With parameter - prints custom sound

        // Display attributes using getters
        System.out.println("Name: " + whiskers.getName() + ", Age: " + whiskers.getAge() + ", Color: " + whiskers.getColor());

        // Call showAffection from Pet interface
        whiskers.showAffection();

        // Demonstrate method overloading in derived classes
        System.out.println("\n--- Method Overloading Demonstration ---");
        joy.eat();                          // No parameters
        joy.eat("chicken", 500);            // With parameters

        whiskers.eat();                     // No parameters
        whiskers.eat("fish", 200);          // With parameters


    }
}