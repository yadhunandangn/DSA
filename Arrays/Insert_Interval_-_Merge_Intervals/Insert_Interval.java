import java.util.*;

public class Insert_Interval{
    public int[][] insert(int[][] intervals , int[] newInterval ) {
        List<int[]> result = new ArrayList<>();
        boolean inserted = false;

        for(int[] existing : intervals  ){
            if(existing[1]<newInterval [0]){
                result.add(existing);
            }
            else if (existing[0]>newInterval [1]){
                if(!inserted){
                    result.add(newInterval );
                    inserted=true;
                }
                result.add(existing);
            }
            else {
                newInterval[0]=Math.min(existing[0],newInterval[0]);
                newInterval[1]=Math.max(existing[1],newInterval[1]);
            }
        }

        if(!inserted){
            result.add(newInterval );
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Insert_Interval obj = new Insert_Interval();
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = obj.insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}