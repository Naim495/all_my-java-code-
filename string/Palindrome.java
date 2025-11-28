public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = s.equals(new StringBuilder(s).reverse().toString());
        System.out.println(isPalindrome);
    }
}
