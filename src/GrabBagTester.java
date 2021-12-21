import java.util.*;

public class GrabBagTester {

    public static void main(String[] args) {
        Random rand = new Random();

        // create a list of 3 fruits
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Citrus");

        GrabBag<String> bag = new GrabBag<>(list);

        // test out class
        System.out.println(bag);

        // grab 3 fruits
        Iterator<String> it = bag.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
