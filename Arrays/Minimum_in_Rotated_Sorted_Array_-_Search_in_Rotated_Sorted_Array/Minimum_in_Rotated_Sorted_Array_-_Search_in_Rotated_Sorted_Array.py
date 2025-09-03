def minInSorted(nums)->int:
    left=0
    right=len(nums)-1
    while left < right:
        mid = left + (right-left)//2
        if nums[mid] > nums[right]:
            left = mid + 1
        else:
            right = mid
    return nums[left]
def main():
    nums=[3,4,5,1,2]
    result=minInSorted(nums)
    print(result)
if __name__ == "__main__":
    main()
