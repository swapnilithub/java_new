public class palindromenew {
    public static void main(String[] args){
        int n = 121;
        int rev = 0;
        int original = n;

        while(n>0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        if(rev == original){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
