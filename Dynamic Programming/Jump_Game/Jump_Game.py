def solution(nums)->bool:
    maxReach=0
    n=len(nums)
    for i in range (n):
        if i>maxReach:
            return False
        maxReach=max(maxReach,i+nums[i])
    return True
def main():
    nums=[2,3,1,1,4]
    print(solution(nums))
if __name__=="__main__":
    main()