public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public Food getFavorite() {
        if (age >= 4) {
            return Food.CHURU;
        } else if (1 <= age) {
            return Food.KATSUOBUSHI;
        } else {
            return Food.NIBOSHI;
        }
    }
}
