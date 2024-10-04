/* Online Java Compiler and Editor */
import java.util.ArrayList;
import java.util.Collections;

public class HelloWorld {

    public static void main(String []args) {
        System.out.println("ArrayList");
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        newList.add(2);
        newList.add(3);
        newList.add(9);
        newList.add(19);
        System.out.println(newList);
        newList.add(0, 6);
        System.out.println(newList);
        newList.set(1, 5);//update the existing elem at pos 1 from 2 to 5
        System.out.println(newList);
        newList.remove(2);
        System.out.println(newList);
        //Searching an element
        if(newList.contains(5)) {
            System.out.println("Yes");
        }
        //sorting using Collections
        Collections.sort(newList);
        System.out.println(newList);
        //copy from list1 to list2
        //Collections.copy(newList2, newList);
        System.out.println(newList2);
        //reversing a list
        Collections.reverse(newList);
        System.out.println(newList);
    }
}
