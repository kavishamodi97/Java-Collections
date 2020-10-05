import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer, String>();

        hm.put(100,"Amit");  //Put elements in Map
        hm.put(101,"Kohli");
        hm.put(102,"Raina");
        hm.put(102,"Shikhar");//trying duplicate key


        for(Map.Entry m:hm.entrySet()){
            System.out.println("Key:" + m.getKey() + " "+ "Value:" + m.getValue());
        }

        hm.putIfAbsent(103,"Dhoni");
        System.out.println(hm);

        HashMap<Integer,String> map=new HashMap<Integer,String>();

        map.putAll(hm);
        System.out.println(map);

        System.out.println(map.isEmpty());

       System.out.println(hm.containsKey(102));

        System.out.println(hm.containsValue("Amit"));

        hm.replace(101,"KLRahul");
        System.out.print(hm);
        System.out.println();
        System.out.println("Replace old value with new value:-");
        hm.replace(102, "Shikhar", "Zahir");
        System.out.print(hm);
    }
}
