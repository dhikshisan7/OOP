package DAY6.CW.COLLECTIONS.ARRAYLIST;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    ArrayList list = new ArrayList();
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add("Dhikshi");
        list.add(20);
        list.add('F');
        list.add(356.12);
        list.add(true);
        list.add("Dhikshi");
        list.add(null);
        System.out.println("Original List:"+ list);

        list.set(4,false);
        list.add(3,"Catherine");
        System.out.println("Updated List:"+list);
        System.out.println("Element at 5th Index:"+list.get(5));
        list.clear();
        System.out.println(list);
        System.out.println("List Is Empty:"+list.isEmpty());

        //Homogenous Array
        List<Integer> list2=new ArrayList<>();
        list2.add(52);
        list2.add(75);
        list2.add(100);
        System.out.println("Size Of Homogenous Array:"+list2.size());


        Integer[] array=new Integer[]{1,2,3,4,5};
        List<Integer> list1=new ArrayList<>(Arrays.asList(array));
        System.out.println("IntegerList from an array"+list1);
        //For Loop
        System.out.println("Get elements using for loop:");
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        //Enhanced Loop
        System.out.println("Get elements using enhanced loop:");
        for(Integer temp:list1){
            System.out.println(temp);
        }
        //Iterator
        System.out.println("Get elements using Iterator:");
        Iterator<Integer> it=list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
