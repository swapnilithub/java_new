import java.util.*;

public class highestnumberfromagiven_num {
    public static void main(String[] args) {
        int num = 123;

        String str = String.valueOf(num);
        System.out.println(str);
        char arr[] = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
