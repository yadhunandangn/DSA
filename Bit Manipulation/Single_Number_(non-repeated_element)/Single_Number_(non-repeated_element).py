def Single_Number(nums):
    xor = 0
    for num in nums:
        xor ^= num
    return xor
print(Single_Number([4,1,2,1,2]))
