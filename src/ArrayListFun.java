//import ArrayLists
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        //create an ArrayList of Integers
        //format is ArrayList<E> listName = new ArrayList<E>();
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        //create an ArrayList of Doubles
        ArrayList<Double> doubleList = new ArrayList<Double>();
        //create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<String>();

        //print your list of Doubles
        System.out.println(doubleList);

        //add a new value to the end list of Integers then print it
        integerList.add(3);
        System.out.println(integerList);
        integerList.add(7);
        integerList.add(12);
        integerList.add(45);
        integerList.add(-2);
        integerList.add(18);

        //add 57 at index 2 in the Integer list then print it
        System.out.println(integerList);
        integerList.add(2,57);
        System.out.println(integerList);


        //get the item an index 4 in the Integer array list
        int valueAtFour = integerList.get(4);
        System.out.println(valueAtFour);
        //add a new value of 33 to the Integer array list and get its size
        integerList.add(33);
        System.out.println("The size is: " + integerList.size());

        //set the item at index 3 to be 42 in the Integers array, store the replaced element, then
        // print the new list and the replaced value
        int oldValue = integerList.set(3,42);
        System.out.println(integerList);
        System.out.println(oldValue);

        //remove the item at index 2 in the Integers array
        integerList.remove(2);
        System.out.println(integerList);
        System.out.println("The size of the list is: " + integerList.size());



    }
}