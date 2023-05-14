abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void speak();

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void speak() {
        System.out.println("Meow");
    }

    public String getColor() {
        return color;
    }
}

class Dog extends Animal {
    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void speak() {
        System.out.println("Woof");
    }

    public String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Fluffy", 3, "Orange");
        System.out.println("Cat name: " + myCat.getName());
        System.out.println("Cat age: " + myCat.getAge());
        System.out.println("Cat color: " + myCat.getColor());
        myCat.speak();
        myCat.sleep();

        Dog myDog = new Dog("Rufus", 5, "Brown");
        System.out.println("Dog name: " + myDog.getName());
        System.out.println("Dog age: " + myDog.getAge());
        System.out.println("Dog color: " + myDog.getColor());
        myDog.speak();
        myDog.sleep();
    }
}
