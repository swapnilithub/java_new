import java.util.*;

public class highestnumberfromagiven_num {
    public static void main(String[] args) {
        int num = 28194812;

        String str = String.valueOf(num); // convert int to string
        System.out.println(str);  
        char arr[] = str.toCharArray();  //converting string to array

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);   //printing the array
        }
        Arrays.sort(arr);   // sorting the array arr
        System.out.println(Arrays.toString(arr));

        String strr = new String(arr);   //converting array back to string for reversing
        System.out.println(strr);

        String rev = "";   //taken an empty string so i can put my values in here
        for(int i=strr.length()-1; i>=0; i--){   
        rev = rev + strr.charAt(i);   //entering the rev values one by one
    }
    System.out.println(rev);   // printing the output
}
}
