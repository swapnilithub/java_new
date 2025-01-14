
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "bcdeabdefjsiouiou";
        HashMap<Character, Integer> hMap = new HashMap<>();
        
        for(char s : str.toCharArray()){
           hMap.put(s, hMap.getOrDefault(s, 0) + 1);
        }
        System.out.println(hMap);
        
        hMap.forEach((key, value) -> {
             if ("aeiou".indexOf(key) >= 0) { 
                System.out.println(key + ": " + value);
            }
        });
    }
}
