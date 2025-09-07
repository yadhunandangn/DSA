import java.util.*;

public class Coin_Change{
    public int solution (int[] coins , int amount){
        int max=amount+1;
        int[] dp=new int[max];
        Arrays.fill(dp,max);
        dp[0]=0;
        for(int coin : coins){
            for ( int i=coin;i<=amount;i++){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    public static void main(String[] args) {

        Coin_Change cc=new Coin_Change();
        int[] coins={1,2,5};
        int amount=11;
        System.out.println(cc.solution(coins,amount));
    }
}
