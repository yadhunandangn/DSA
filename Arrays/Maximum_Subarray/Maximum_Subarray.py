def MaxSubarray(nums)->int:
    currMax=nums[0]
    maximum=nums[0]
    for i in nums:
        currMax=max(i,currMax+i)
        maximum=max(currMax,maximum)
    return maximum
def main():
    nums=[-2,1,-3,4,-1,2,1,-5,4]
    result=MaxSubarray(nums)
    print(result)
if __name__ == "__main__":
    main()