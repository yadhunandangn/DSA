class Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println("xor value before ->"+xor);
            xor ^= i;
            System.out.println("i value -> "+i +" xor value after ->"+xor);
        }

        for (int num : nums) {
            xor ^= num;
            System.out.println("num  value ->  "+num +" xor value -> "+xor);
        }

        return xor;
    }
    public static void main(String[] args) {
        Missing_Number obj = new Missing_Number();
        int[] nums = { 0, 1};
        System.out.println(obj.missingNumber(nums));
    }
}
