import java.util.*;
class coolerdilemma
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int m=(y-1)/x;
            System.out.println(m);
	}
    scanner.close();
}
}
