import java.util.ArrayList;
import java.util.List;

/**
 * Ex_47
 * Java List Interface with Examples
 * In Java, the List interface is an ordered collection
 * that allows us to store and access elements
 * sequentially. It extends the Collection interface.
 * 
 * Classes that Implement List:
 * Since List is an interface, we cannot create objects
 * from it.
 * 
 * In order to use functionalities of the List
 * interface, we can use these classes:
 * 
 * - ArrayList
 * - LinkedList
 * - Vector
 * - Stack
 * 
 * Methods:
 * add() - adds an element to a list
 * addAll() - adds all elements of one list to another
 * get() - helps to randomly access elements from lists
 * remove() - removes an element from the list
 * removeA11() - removes all the elements from the list
 * 
 */
public class Ex_47 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("programming");
        myList.add("for");
        myList.add("beginners");
        myList.add(2, "YouTube");
        System.out.println("list content is " + myList);
        List<String> myList1 = new ArrayList<>();
        myList1.addAll(myList);
        System.out.println("list1 content is " + myList1);

        myList.remove(2);
        System.out.println("list content is " + myList);
    }
}