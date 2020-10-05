import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer, String>();

        map.put(100,"Amit");  //Put elements in Map
        map.put(101,"Kohli");
        map.put(102,"Raina");
        map.put(102,"Shikhar");//trying duplicate key


        for(Map.Entry m:map.entrySet()){
           System.out.println("Key:"+ m.getKey() + " " + "Value: " + m.getValue());
        }
        System.out.println("Comparing By Key:-");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("Comparing By Key in Reverse Order:-");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("Comparing By Value:-");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("Comparing By Value in Reverse Order:-");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }
}
