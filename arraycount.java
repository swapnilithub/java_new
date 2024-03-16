import java.util.*;
public class arraycount {
    

	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count=0;
        int i;
        while (t-- > 0) {
        int n = scanner.nextInt();
        int [] d= new int[n];
        for(i=0;i<n;i++)
        d[i] = scanner.nextInt();
{
        if(d[i]>=1000) {
             count++;   
        }
} 
        System.out.println(+count);
	} scanner.close();
}
}
