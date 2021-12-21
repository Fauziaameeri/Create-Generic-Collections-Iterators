public class MyArrayListTester {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<String>();

        // add three object to list
        list.add("one");
        list.add("two");
        list.add("three");

        // print out status of list
        System.out.println("Expected Index 0: - Actual " + list.indexOf("one"));
        System.out.println("Expected Size: 3 Actual - " + list.size());
        System.out.println("Expected Get two: Actual - " + list.get(1));

        // remove object at index 1
        System.out.println("Remove two");
        list.remove(1);
        System.out.print("After Remove two: " + list);

        testIntegerList();
        testDieList();

    }

    public static void testIntegerList() {
        // Create an array list to Integer objects
        MyArrayList<Integer> list = new MyArrayList<Integer>();

        // Add three Integer objects
        list.add(0);
        list.add(-21);
        list.add(100);

        // print status of list
        System.out.println("Expected Index 1: - Actual " + list.indexOf(-21));
        System.out.println("Expected Size: 3 Actual - " + list.size());
        System.out.println("Expected Get 100: Actual - " + list.get(2));

        // remove object at index 2
        System.out.println("Remove 100");
        list.remove(2);
        System.out.print("After Remove two: " + list);

    }

    public static void testDieList() {
        // Create an array list to Die objects
        MyArrayList<Die> list = new MyArrayList<Die>();
        Die die1 = new Die(20);

        // Add three Die objects
        list.add(new Die(2));
        list.add(new Die(5));
        list.add(die1);

        // print status of list
        System.out.println("Expected Index 2: - Actual " + list.indexOf(die1));
        System.out.println("Expected Size: 3 Actual - " + list.size());
        System.out.println("Expected Get Die has 20 sides.: Actual - " + list.get(2));

        // remove object at index 0
        System.out.println("Remove Die has 2 sides.");
        list.remove(0);
        System.out.print("After Remove Die has 2 sides.: " + list);

    }

}
