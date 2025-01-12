import java.util.HashSet;
import java.util.*;

//using HashSet

public class duplicates {
    public static void main(String[] args) {
        int arr [] = {1,2,43,32,211,21,21,342,53,12,12,1,2,3,4,5,6};

        HashSet <Integer> hset = new HashSet <>();
        for(int num : arr){
            hset.add(num);
        }
        System.out.println(hset);
        List <Integer> list = new ArrayList <>(hset);

        Collections.sort(list);

        System.out.println(list);
    }
}
