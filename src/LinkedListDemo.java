import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        System.out.println("Initial List Data....");
        list1.add("JIO");
        list1.add("Zoom");
        list1.add("Facebook");
        list1.add("Instagram");
        list1.add("Geeks for Geeks");
        list1.add("Code forces");
        list1.add("chefs");
        list1.add("Movies Mania");
        list1.add("Myntra");


        System.out.println(list1);
        list2.addAll(list1);
        System.out.println(list2);

        System.out.println(list1.get(2));
        list1.set(0, "Adobe Scanner");

        //LinkedList specific Methods:-

        list1.addFirst("Twitter");
        list1.addLast("Book My Show");

        System.out.println(list1);

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        list1.removeFirst();
        list1.removeLast();
        list1.remove("Facebook");
        list1.removeLastOccurrence("Myntra");
        System.out.println(list1.size());
        System.out.println(list1);

        //Traversing the list of elements in reverse order

        Iterator itr=list1.descendingIterator();
        while(itr.hasNext()){
            System.out.print(" " + itr.next() + ",");
        }

    }
}

