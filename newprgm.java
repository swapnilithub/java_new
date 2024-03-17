import java.util.*;
public class newprgm {
 
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int N  = sc.nextInt();
		    if(N%3==0)
		    System.out.println(0);
		    else 
		    System.out.println(3 - N%3);
		}
        sc.close();
	}


}

	