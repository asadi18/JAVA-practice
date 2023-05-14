
// Multilevel

class Animal {
    void eat() {
        System.out.println("Hi Hi Bye Bye");
    }
}

class Dog extends Animal {
    void dog() {
        System.out.println("Vu Vu ......");
    }
}

class BabyDog extends Dog {
    void babydog() {
        System.out.println("Baby VU vu ....");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Animal obAnimal = new Animal();
        Dog obDog = new Dog();
        BabyDog oBabyDog = new BabyDog();
        obAnimal.eat();
        obDog.dog();
        oBabyDog.babydog();

    }
}
