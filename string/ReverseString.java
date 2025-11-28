public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
