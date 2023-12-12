import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ParseJson parseJson = new ParseJson("src/main/Toys.json");
        ToyStore toyStore = parseJson.getToyStore();
        System.out.println(toyStore);
    }
}

