import java.util.Scanner;

public class facebooksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
                int maxa=0;
                int maxb=0;
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // your code goes here
            int index=0;
            for(int i=0;i<n;i++){
                    if(a[i]>maxa || a[i]==maxa && b[i]>maxb){
                            maxa=a[i];
                            maxb=b[i];
                            index=i;
                    }
            }
            System.out.println(index + 1);
    
}
scanner.close();

}
}
