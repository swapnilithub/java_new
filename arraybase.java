
import java.util.*;
public class arraybase {
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count=0;
        while (t-- > 0) {
        int n = scanner.nextInt();
        int[] d= new int[n];
for(int i=0;i<d.length;i++){
        if(d[i]>=1000){
             count=count+1;   
        }
}
	} scanner.close();
}

}
