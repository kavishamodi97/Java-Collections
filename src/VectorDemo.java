import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){

        Vector<String> vec=new Vector<String>();

        vec.add("Code Academy");
        vec.add("Udemy");
        vec.add("Code-Champ");
        vec.add("HackerRank");
        vec.add("HackerEarth");
        vec.add("CodeChef");
        vec.add("CodeForces");
        vec.add("PluralSight");
        vec.add("WhiteHatJr.");
        vec.add("Leet code");
        vec.add("Algo Expert");
        vec.add("LCO");
        vec.add("Coursera");

        vec.addElement("Skillenza");

        System.out.println(vec);

        System.out.println(vec.elementAt(5));

        System.out.println(vec.contains("udacity"));

        System.out.println(vec.firstElement());

        System.out.println(vec.get(9));

      vec.insertElementAt("prepbytes",2);

      System.out.println(vec);

      Collections.replaceAll(vec, "HackerEarth", "Hacathon");

      System.out.println(vec);

        System.out.println(vec.capacity());

        System.out.println(vec.size());

        Vector<String> vector=new Vector<String>(40);

        System.out.println(vector.capacity());

        System.out.println(vector.size());

        System.out.println(vec.remove(7));

        vec.removeElementAt(5);

        System.out.println(vec);

        vec.spliterator();
        System.out.println(vec);

        ListIterator<String> li = vec.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }


    }
}
