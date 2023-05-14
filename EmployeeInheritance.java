class Main {
    float slary = 4000;
}

class Programmer extends Main {
    int bonus = 500;

    public static void main(String[] args) {
        Programmer obj = new Programmer();
        System.out.println(obj.slary + obj.bonus);
    }
}