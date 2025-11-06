package DAY6.CW.COLLECTIONS.HASHSET;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
//     HashSet set=new HashSet<>();
        Set<String> hs=new HashSet<>();
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Strawberry");
        System.out.println("Original HashSet:"+hs);
        System.out.println("Size of HashSet:"+hs.size());
        hs.remove("Banana");
        System.out.println("Removed Banana:"+hs);
        Set<String> fruits=new HashSet<>();
        fruits.add("Blueberry");
        fruits.add("Guava");
        hs.addAll(fruits);
        System.out.println("Fruits Hashset with HS:"+hs);

        List<String> list=new ArrayList<>(hs);
        System.out.println(list.get(2));
        System.out.println("Get elements using for loop:");
        for(String temp:hs){
            System.out.println(temp);
        }

        Iterator<String> it=hs.iterator();
        System.out.println("Get elements using Enhanced loop:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
