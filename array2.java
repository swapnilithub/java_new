import java.util.Scanner;

public class array2 {
    
	public static void main (String[] args)
	{
	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int a[]=new int[N];
        
        for(int i=0;i<a.length;i++){
            if(X==a[i]){
                System.out.print("YES");
            }
            else
            System.out.print("NO");
            scanner.close();
        }
}

}
