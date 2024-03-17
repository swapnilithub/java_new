import java.util.Scanner;
public class diifilvlarrray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];
            
            for (int i = 0; i < n - 1; i++) {
                d[i] = scanner.nextInt();
                if (d[i] < d[i + 1]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            scanner.close();
        }
    }

}
   
