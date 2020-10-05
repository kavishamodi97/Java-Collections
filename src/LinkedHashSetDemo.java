import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    
    public static void main(String args[]){
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("Kohli");
        lhs.add("Dhoni");
        lhs.add("Kishan");
        lhs.add("ricky");
        lhs.add("Shikhar");
        lhs.add("Yuvraj");
        lhs.add("sachin");
        lhs.add("ganguli");
        lhs.add("Harbhajan");
        lhs.add("Yusuf");
        lhs.add("sachin");
        lhs.add("sachin");
        lhs.add("Yusuf");
        lhs.add("sachin");


        Iterator itr=lhs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
    
}

