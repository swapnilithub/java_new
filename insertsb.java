public class insertsb {
    public static void main(String[] args) {
        StringBuilder newq = new StringBuilder("hey");
        System.out.println(newq);
        newq.insert(2,'r');
        System.out.println(newq);
    }
}
//At any position we can insert with the .insert function in Sting builder