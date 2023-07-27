import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        List<Dog> dogList = DogList.setDogList();

        for (Dog dog : dogList) {
            System.out.println(dog.getName());
        }

        for (Dog dog : dogList) {
            System.out.println(dog.getName().toUpperCase());
        }

    }
}
