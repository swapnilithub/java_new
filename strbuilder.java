public class strbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Hey han");
        System.out.println(name);
        name.setCharAt(0, 'j');
        System.out.println(name);
    }
}
