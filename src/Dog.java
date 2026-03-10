// Dog class extending Animal and implementing Pet interface
public class Dog extends Animal implements Pet {

    // Unique attribute for Dog class
    private String breed;

    // Constructor calling parent constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Getter and Setter for breed attribute
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override makeSound to print "Bark"
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    // Implement showAffection from Pet interface
    @Override
    public void showAffection() {
        System.out.println(getName() + " wags its tail.");
    }

    // Method overloading example - eat method with no parameters
    public void eat() {
        System.out.println(getName() + " is eating meat");
    }

    // Overloaded eat method with parameters
    public void eat(String type, int measure) {
        System.out.println(getName() + " is eating " + type + " measure " + measure);
    }
}