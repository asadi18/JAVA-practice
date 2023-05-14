class A {
    String sname = "Asad";
    String slname = "Ishteaque";
    int age = 25;
}

public class AccessingObjects {
    String fname = "Jay";
    String lname = "Kyi";
    int age = 95;

    public static void main(String[] args) {
        AccessingObjects myObj = new AccessingObjects();
        A obj2 = new A();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Name: " + obj2.sname + " " + obj2.slname);
        System.out.println("Age: " + obj2.age);

    }
}
