def missingNumber(nums):
    n=len(nums)
    total=n*(n+1)//2
    print(total)
    sum_of_nums=sum(nums)
    print(sum_of_nums)
    return total-sum_of_nums

def main():
    nums=[3,0,1]
    print(missingNumber(nums))
if __name__ == "__main__":
    main()