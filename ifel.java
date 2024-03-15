import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x>y){
                System.out.println("LOSS");
        }
        else if(x==y){
                System.out.println("NUETRAL");
        }
        else{
                System.out.println("PROFIT");
        }
        
	}scanner.close();
	}
    
}

