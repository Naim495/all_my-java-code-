public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;   // কতগুলো সংখ্যা প্রিন্ট করবো
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
