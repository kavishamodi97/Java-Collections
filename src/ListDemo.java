import java.util.*;

public class ListDemo {
    public static void main(String args[]) {

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();


        list1.add("PHP");
        list1.add("Python");
        list1.add("GoLang");
        list1.add("Angular");
        list1.add("Node");
        list1.add("React");
        list1.add("JAVA");
        list1.add("Spring");
        list1.add("Hibernate");
        list1.add("Wordpress");

        System.out.println(list1);
        list2.addAll(list1);
        System.out.println(list2);

        System.out.print(list1.get(1));
        list1.set(1, "Kotlin");
        System.out.println();
        System.out.println(list1);

        System.out.println(list1.isEmpty()); //return false

        System.out.println(list1.indexOf("Node"));

        System.out.println(list1.lastIndexOf("Wordpress"));

        System.out.println(list1.contains("Magento")); //return false

        list2.containsAll(list1);
        System.out.println(list2);


        list2.clear();
        System.out.println(list2);


        System.out.println(list1.remove(2));
        System.out.println(list1.subList(2, 5));

        String array[] = list1.toArray(new String[list1.size()]);
        System.out.println("Printing Array:- " + Arrays.toString(array));

        ListIterator ltr = list1.listIterator();

        System.out.println("Traversing elements in forward direction:-");

        while (ltr.hasNext()) {
            System.out.print(" " + ltr.next() + ",");
        }

        System.out.println();
        System.out.println("Traversing elements in Backward direction:-");

        while (ltr.hasPrevious()) {
            System.out.print(" " + ltr.previous() + ",");
        }

        System.out.println();
        Collections.sort(list1);

        for (String sortedList : list1) {
            System.out.println(" Sorted List:- " + sortedList);
        }
    }
}
