// Cat class extending Animal and implementing Pet interface
public class Cat extends Animal implements Pet {

    // Unique attribute for Cat class
    private String color;

    // Constructor calling parent constructor
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Getter and Setter for color attribute
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Override makeSound to print "Meow"
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // Implement showAffection from Pet interface
    @Override
    public void showAffection() {
        System.out.println(getName() + " purrs softly.");
    }

    // Method overloading example - eat method with no parameters
    public void eat() {
        System.out.println(getName() + " is drinking milk");
    }

    // Overloaded eat method with parameters
    public void eat(String type, int measure) {
        System.out.println(getName() + " is eating " + type + " measure " + measure);
    }
}