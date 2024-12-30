import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = {1,2,3,4,5,6,6,2,4,34,92, 22,23,23,323,23,23,23,23,23,2,34,3,42,3,23,23,23,23,2,32,3,23,23,23,2,33,2,23,23,23,2,3,23,2,32,44,3,43};
           HashMap<Integer, Integer> hMap = new HashMap <>();
           
          for(int num: arr){
               hMap.put(num, hMap.getOrDefault(num, 0)+1);
          }
          System.out.println(hMap);
          hMap.forEach((key, value) -> {
              if (value == 2) {
        System.out.println("Key " + key + " has value " + value);
                        }
                       });

    }
}
