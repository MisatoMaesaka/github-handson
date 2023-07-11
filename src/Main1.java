public class Main1 {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Dog dog1 = new Dog("Pochi");
        Dog dog2 = new Dog("Taro");
        Dog dog3 = new Dog("Kuro");

        System.out.println("Hello," + dog1.getName() + "!");
        System.out.println("Hello," + dog2.getName() + "!");
        System.out.println("Hello," + dog3.getName() + "!");

        dog1.setName("ppppp");
        System.out.println(dog1.getName());

    }

}