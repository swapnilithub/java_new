import java.util.Scanner;
public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();
        if(a%4==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        sc.close();
    }
}
