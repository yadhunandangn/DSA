def solution (arr,target)->list:
    num_dict={}
    for i in arr:
        if target-i in num_dict:
            return [target-i,i]
        num_dict[i]=1
    return []
def main():
    arr=[10,15,3,7]
    target=17
    result=solution(arr,target)
    print(result)
if __name__ == "__main__":
    main()
