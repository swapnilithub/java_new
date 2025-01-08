import java.util.*;

public class highestnumberfromagiven_num {
    public static void main(String[] args) {
        int num = 28194812;

        String str = String.valueOf(num); // convert int to string
        char arr[] = str.toCharArray();  //converting string to array

        Arrays.sort(arr);   // sorting the array arr

        String strr = new String(arr);   //converting array back to string for reversing

        String rev = "";   //taken an empty string so i can put my values in here
        for(int i=strr.length()-1; i>=0; i--){   
        rev = rev + strr.charAt(i);   //entering the rev values one by one
    }
    System.out.println(rev);   // printing the output
}
}
