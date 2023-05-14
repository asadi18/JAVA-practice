public class Encapsul1 {
    private String name;

    // get the name
    public String getName() {
        return name;
    }

    // set the Name
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsul1 obj = new Encapsul1();
        obj.setName("Asad");

        System.out.println(obj.getName());
    }

}
