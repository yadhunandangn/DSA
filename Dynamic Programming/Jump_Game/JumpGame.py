def jump(nums):
    jump=0
    furtherest=0
    end=0
    n=len(nums)
    for i in range(n-1):
        furtherest=max(furtherest,i+nums[i])
        if i==end:
            jump+=1
            end=furtherest
    return jump
def main():
    nums=[2,3,1,1,4]
    print(jump(nums))
if __name__=="__main__":
    main()