import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> ts=new TreeSet<String>();

        ts.add("Kohli");
        ts.add("Dhoni");
        ts.add("Kishan");
        ts.add("ricky");
        ts.add("Shikhar");
        ts.add("Yuvraj");
        ts.add("sachin");
        ts.add("ganguli");
        ts.add("Harbhajan");
        ts.add("Yusuf");
        ts.add("sachin");
        ts.add("sachin");
        ts.add("Yusuf");
        ts.add("sachin");

        System.out.println(ts);

        ts.ceiling("Harbhajan");

        System.out.println(ts);
        Iterator<String> itr=ts.descendingIterator();
        while(itr.hasNext()){
            System.out.print(" " +itr.next() + ",");
        }
        System.out.println();
        NavigableSet<String> n=ts.descendingSet();
        System.out.println(n);

        ts.floor("Yuvraj");
        System.out.println(ts);

        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());

        System.out.println("Head Set "+ ts.headSet("Kishan",true));

        System.out.println("SubSet: "+ts.subSet("Kohli", false, "sachin", true));

        System.out.println("TailSet: "+ts.tailSet("Shikhar", true));

    }
}
