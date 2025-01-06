public class sumof {
    public static void main(String[] args) {
        int n =33332;
        int sum =0;
       while(n>0){
        int temp = n%10;
        sum=temp+sum;
        n=n/10;
       }
       System.out.println(sum);
    }
}
