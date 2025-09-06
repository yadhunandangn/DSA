public class Counting_bits {
    public int[] count(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                ans[i] = ans[i / 2];
            } else {
                ans[i] = ans[i - 1] + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Counting_bits obj = new Counting_bits();
        int n = 6;
        int[] result = obj.count(n);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
