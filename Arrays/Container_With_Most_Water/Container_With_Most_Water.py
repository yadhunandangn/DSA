def MaxArea(height) -> int:
    left=0
    right=len(height)-1
    maximum=0
    while left < right:
        width = right-left
        water=min(height[left],height[right])*width
        maximum=max(maximum,water)
        if height[left]<height[right]:
            left+=1
        else:
            right-=1
    return maximum

def main():
    height = [1,8,6,2,5,4,8,3,7]
    maximum =  MaxArea(height)
    print(maximum)

if __name__ == "__main__":
    main()
