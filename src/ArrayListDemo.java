import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>(); //Creating arraylist
        al.add("OOP"); //Adding object in arraylist
        al.add("Algorithm");
        al.add("Data Structure");
        al.add("Machine Learning");
        //Printing the arraylist object
        System.out.println(al);
        System.out.println("return specific Element:- " + al.get(2));
        //Replacing the element
        al.set(2, "Operating System");
        System.out.println(al);
        al.add("computer Graphics");
        System.out.println(al);
        //remove element at specified location
        al.remove(4);
        al.add("Algorithm");
        System.out.println(al);
        //return first occurrence index
        System.out.println(al.indexOf("Algorithm"));
        //return last occurrence index
        System.out.println(al.lastIndexOf("Algorithm"));
        //return true if object present in collection
        System.out.println(al.contains("Operating System")); //return true
        //return elements in specified range
        System.out.println(al.subList(1, 3));
        //return total number of element in collection
        System.out.println(al.size());

        //Traversing list through Iterator

        Iterator itr = al.iterator(); //getting the Iterator

        while (itr.hasNext()) {   //check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        //Traversing list through for-each loop
        for (String str : al) {
            System.out.print(" " + str);
        }

        //Sorting the list
        Collections.sort(al);

        for (String sortedList : al) {
            System.out.println(" Sorted List:- " + sortedList);
        }

        System.out.println("Sorting numbers:-");

        //Creating a list of numbers
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(120);
        list.add(70);
        list.add(40);
        list.add(100);

        //Sorting the list
        Collections.sort(list);

        //Traversing list through the for-each loop
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}

