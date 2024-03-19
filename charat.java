public class charat {
    public static void main(String[] args) {
        String fname = "Swapnil";
        String lname = "Ranjan";
        String fullname =fname+" "+lname;
        System.out.println(fullname);
        

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}
