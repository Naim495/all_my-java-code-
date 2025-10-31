class Main {
    public static void main(String[] args) {
        int[] nums = {8, 15, 3, 25, 10};
        int max = nums[0]; // assume first element is max

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}
