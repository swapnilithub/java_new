import java.util.*;

public class maxele {
        public static void main (String[] args) throws java.lang.Exception {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n]; // Corrected declaration of array
                int max = Integer.MIN_VALUE; // Initialize max to the smallest integer value
                for(int i = 0; i < n; i++) { // Corrected loop condition
                    a[i] = sc.nextInt();
                    if(a[i] > max) {
                        max = a[i];
                    }
                }
                System.out.println(max); // Moved print statement outside the loop
            }
            sc.close(); // Close the scanner to prevent resource leak
        }
    }
    
