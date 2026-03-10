public class Animal {
    // animal attribute
    private String name;
    private int age;

    // constructor getter and setter
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setter name and age
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // getter name and age
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // make generic sound
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
    // overload makeSound
    public void makeSound(String sound) {
        System.out.println(sound);
    }



}

