class A {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

public class Encapsulation1 {
    public static void main(String args[]) {
        A obj = new A();
        obj.setSalary(23850);
        System.out.println("The Salary is " + obj.getSalary());
    }

}
