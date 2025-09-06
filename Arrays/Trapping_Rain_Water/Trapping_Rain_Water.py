def trap(height) -> int:
    if not height:
        return 0

    left=0
    right =  len(height) - 1
    left_max, right_max = height[left], height[right]
    water_trapped = 0

    while left < right:
        if left_max < right_max:
            left += 1
            left_max = max(left_max, height[left])
            water_trapped += left_max - height[left]
        else:
            right -= 1
            right_max = max(right_max, height[right])
            water_trapped += right_max - height[right]

    return water_trapped
def main():
    height = [4,2,0,3,2,5]
    print(trap(height))
if __name__ == "__main__":
    main()
