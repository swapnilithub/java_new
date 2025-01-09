
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("The BS");
        int arr[] = {1,2,4,5,7,89,76543,384231};
        int k = 8, left = 0, right = arr.length-1;
        
        while(right >= left){
            int mid = (left + right)/2;
            
            if (arr[mid] == k) {
            }
            else if(arr[mid] > k){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
     System.out.println(left);
    }
}
