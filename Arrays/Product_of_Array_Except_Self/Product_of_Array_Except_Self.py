def FindProduct(nums)->list:
    n = len(nums)
    res = [1] * n
    print(res)
    prefix = 1
    for i in range(n):
        res[i] = prefix
        prefix *= nums[i]
    suffix = 1
    for i in range(n - 1, -1, -1):
        res[i] *= suffix
        suffix *= nums[i]
    return res
def main():
    nums=[1,2,3,4]
    result=FindProduct(nums)
    print(result)
if __name__ == "__main__":
    main()