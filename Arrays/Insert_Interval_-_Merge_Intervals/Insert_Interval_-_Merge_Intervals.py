def insertInterval(intervals,newIntervals) -> list:
    result=[]
    inserted=False
    for interval in intervals:
        if interval[1]<newIntervals[0]:
            result.append(interval)
        elif interval[0]>newIntervals[0]:
            if not inserted:
                result.append(newIntervals)
                inserted=True
            result.append(interval)
        else:
            newIntervals[0]=min(newIntervals[0],interval[0])
            newIntervals[1]=max(newIntervals[1],interval[1])
    if not inserted:
        result.append(newIntervals)
    return result
def main():
    intervals = [[1,3],[6,9]]
    newInterval = [2,5]
    result = insertInterval(intervals,newInterval)
    print(result)
if __name__ == "__main__":
    main()

