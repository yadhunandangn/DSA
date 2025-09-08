class PartitionequalSubset{
    public boolean  Solution (int[] nums){

        int total=0;
        for(int num : nums){
            total+=num;
        }
        if((total%2)!=0)
        { return false;}
        int target=total/2;
        boolean[] err=new boolean[target+1];
        err[0]=true;
        for (int num : nums){
            for (int i = target;i>=num;i--){
                err[i]=err[i] || err[i-num];
            }
        }
        return err[target];
    }

    public static void main(String[] args) {
        PartitionequalSubset ps=new PartitionequalSubset();
        int[] nums={3,3,1,5};
        System.out.println(ps.Solution(nums));
    }
}