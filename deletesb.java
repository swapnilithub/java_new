public class deletesb {
    public static void main(String[] args) {
        StringBuilder del = new StringBuilder("hello");
        System.out.println(del);
        del.delete(0, 2);
        System.out.println(del);
    }
}
