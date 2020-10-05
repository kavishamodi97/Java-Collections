import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<String>();
        set.add("Kohli");
        set.add("Dhoni");
        set.add("Kishan");
        set.add("ricky");
        set.add("Shikhar");
        set.add("Yuvraj");
        set.add("sachin");
        set.add("ganguli");
        set.add("Harbhajan");
        set.add("Yusuf");
        set.add("sachin");

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains("sachin"));
        set.remove("sachin");
        System.out.println(set);
        System.out.println(set.size());
        set.removeIf(str->str.contains("Harbhajan"));
        System.out.println(set);

        Iterator itr=set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
