import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = {1,2,3,4,5,6,6,2,4,34,92};
        HashSet <Integer> hSet = new HashSet <>();
        for(int num : arr){
            hSet.add(num);
        }
        System.out.println(hSet);
       //hashset cannot be sorted directly.
       if(hSet.contains(44)){
           System.out.println("yes");
       }
       else {
           System.out.println("no");
           List<Integer> list = new ArrayList<>(hSet);

           Collections.sort(list);
           System.out.println(list);
       }
    }
}
