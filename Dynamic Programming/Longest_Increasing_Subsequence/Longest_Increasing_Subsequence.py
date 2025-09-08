def solution(nums):
    n=len(nums)
    dp=[1]*n
    for i in range (1,n):
        for j in range (1,i):
            if nums[i]>nums[j]:
                dp[i]=max(dp[i],dp[j]+1)

    return max(dp)
def main():
    nums=[10,9,2,5,3,7,101,18]
    print(solution(nums))
    nums1=[0,1,0,3,2,3]
    print(solution(nums1))

if __name__=="__main__":
    main()
