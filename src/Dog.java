public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bow() {
        System.out.println("bow!");
    }

    public String getName() {
        return name;
    }

    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

    }
}


