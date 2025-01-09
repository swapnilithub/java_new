public class palindrome3 {
    public static void main(String[] args) {
        String s = "madam";

        StringBuilder sb = new StringBuilder(s);
          String old = sb.reverse().toString();
          
          if(s.equals(old)){
            System.out.println("Palindrome");
          }
          else {
            System.out.println("Not a palindrome");
          }
    }
}
