def coinChange(coins,amount)->int:
    max=amount+1
    dp=[max]*max
    dp[0]=0
    for coin in coins:
        for i in range(coin,amount+1):
            dp[i]=min(dp[i],dp[i-coin]+1)
    return dp[amount] if dp[amount]!=max else -1
def main():
    coins=[1,2,5]
    amount=11
    print(coinChange(coins,amount))
if __name__=="__main__":
    main()