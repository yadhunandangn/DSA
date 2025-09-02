import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threesum (int[] arr)
    {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for (int k = j+1;k<n;k++)
                {
                    if (arr[i]+arr[j]+arr[k]==0)
                    {
                        res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        return res;
       }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = ts.threesum(arr);
        System.out.println(result);
}
}