
public class cat {
    private String name;
    private int age;

    public cat() {
        this.name = "Unknown";
        this.age = 0;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        cat myCat = new cat();
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
    }
}
