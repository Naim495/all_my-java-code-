class Main {
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 12, 15};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum = " + sum);
    }
}
