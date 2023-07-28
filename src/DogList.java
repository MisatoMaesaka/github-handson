import java.util.List;

public class DogList {

    public static List<Dog> setDogList() {

        List<Dog> dogs = List.of(new Dog("Pochi"),
                new Dog("Taro"),
                new Dog("Kuro"));
        return dogs;
    }
}
