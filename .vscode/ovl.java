public class ovl {
    // Overloaded add method
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ovl obj = new ovl();
        int result = obj.add(10, 20); // Calling the add method
        System.out.println("Sum: " + result);
    }
}
//So in method overloading we can make same name of methods more than one with different paramaters.