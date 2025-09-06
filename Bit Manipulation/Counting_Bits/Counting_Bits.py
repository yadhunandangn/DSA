def countBits(n):
    ans=[]
    ans.append(0)
    for i in range(1,n+1):
        if i%2==0:
            ans.append(ans[i//2])
        else:
            ans.append(ans[i-1]+1)
    return ans
print(countBits(6))