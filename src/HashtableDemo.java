import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    
    public static void main(String args[]){
        Hashtable<Integer,String> hs=new Hashtable<Integer, String>();

        hs.put(100,"Amit");  //Put elements in Map
        hs.put(101,"Kohli");
        hs.put(102,"Raina");
        hs.put(102,"Shikhar");
        hs.put(103,"Kishan");//trying duplicate key

        for(Map.Entry m:hs.entrySet()){
            System.out.println("Key:"  + m.getKey() +  " "+ "Value:" + m.getValue());
        }

        hs.remove(102);
        System.out.println("After remove: "+ hs);

        System.out.println(hs.getOrDefault(103, "Not Found"));
        System.out.println(hs.getOrDefault(105, "Not Found"));

        hs.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+hs);
    }
}

