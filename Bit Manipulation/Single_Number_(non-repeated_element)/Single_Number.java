class Single_Number{
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            System.out.println(xor+ " ^ "+num +" = "+(xor ^ num));
            xor ^= num;
        }
        System.out.println("Final xor value -> "+xor);
        return xor;
    }
    public static void main(String[] args) {
        Single_Number obj = new Single_Number();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }
}
