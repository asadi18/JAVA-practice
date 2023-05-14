//Heirarchial 
class Animal {
    void eat() {
        System.out.println("Hi There");
    }
}

class Dog extends Animal {
    void dog() {
        System.out.println("Vu vu .... ");
    }
}

class Cat extends Animal {
    void cat() {
        System.out.println(" Mew Mew ");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Dog objDog = new Dog();
        Cat objCat = new Cat();
        objAnimal.eat();
        objDog.dog();
        objCat.cat();
    }

}