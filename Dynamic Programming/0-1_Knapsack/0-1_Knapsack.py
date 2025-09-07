def partitionEqually(nums) -> bool:
    total=sum(nums)
    if total%2 != 0:
        return False
    target=total//2

    dp=[False]*(target+1)
    dp[0]=True
    for num in nums:
        for i in range (target,num-1,-1):
            dp[i]=dp[i] or dp[i-num]
    return dp[target]
def main():
    nums=[1,5,11,5]
    print(partitionEqually(nums))
if __name__=="__main__":
    main()