# 3 Sum
# Python solution goes here...
def three_sum(arr) -> list:
    n=len(arr)
    res = []
    for i in range (n-2):
        for j in range (i+1,n-1):
            for k in range (j+1,n):
                if arr[i]+arr[j]+arr[k]==0:
                    res.append((arr[i],arr[j],arr[k]))
    return res if res else [[]]

def main():
    arr = [-1, 0, 1, 2, -1, -4]
    print(three_sum(arr))


