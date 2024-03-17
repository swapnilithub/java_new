import java.util.*;
public class maxminusonelararr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
        
        // Your code goes here
        int max = a[0];
        int maxmin = a[0];
        for(int i=0;i<n;i++){
                if(a[i]>max)
                max=a[i];
        }
        for(int i=0;i<n;i++){
                if(a[i]>maxmin && a[i]!=max)
                maxmin=a[i];
        }
                int b;
        b=maxmin+max;
        
        System.out.println(b);
        }
        
        scanner.close();
        
    }
}
