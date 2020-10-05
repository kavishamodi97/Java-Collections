import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
        NavigableMap<Integer,String> map=new TreeMap<Integer,String>();

        tm.put(100,"Amit");  //Put elements in Map
        tm.put(101,"Kohli");
        tm.put(102,"Raina");
        tm.put(102,"Shikhar");
        tm.put(103,"Kishan");//trying duplicate key

        for(Map.Entry m:tm.entrySet()){
            System.out.println("Key:"  + m.getKey() +  " "+ "Value:" + m.getValue());
        }

       tm.remove(102);
       System.out.println(tm);


        map.put(100,"DS");  //Put elements in Map
        map.put(101,"OS");
        map.put(102,"CG");
        map.put(102,"AL");
        map.put(103,"ML");

        for(Map.Entry m1:map.entrySet()){
            System.out.println("Key:"  + m1.getKey() +  " "+ "Value:" + m1.getValue());
        }

        System.out.println("descendingMap: "+map.descendingMap());
        System.out.println("headMap: "+map.headMap(102,true));
        System.out.println("tailMap: "+map.tailMap(102,false));
        System.out.println("subMap: "+map.subMap(100, true, 102, true));
    }
}
