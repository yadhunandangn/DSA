# Best Time to Buy and Sell Stock
# Python solution goes here...
def max_profit(prices) -> int:
    min_price = float('inf')
    max=0
    for i in prices:
        if i <min_price:
            min_price=i
        elif i-min_price >max:
            max=i-min_price
    return max

def main():
    prices = [7,1,5,3,6,4]
    print(max_profit(prices))

if __name__ == "__main__":
    main()