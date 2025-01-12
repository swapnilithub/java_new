import java.util.*;
public class duplicates_using_pointers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 3, 4, 5, 6};
        Arrays.sort(arr);
            int arrNew[] = new int[arr.length];
        int index = 0;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]!=arr[i+1]){
                    arrNew[index++]=arr[i];
                }
            }
            for(int j = 0; j < arrNew.length ; j++){
                if (arrNew[j] == 0) {
                    break;  // Stop the loop when 0 is found
                }
                System.out.println(arrNew[j]);
            }
    }
}
