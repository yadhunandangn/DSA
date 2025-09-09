# Longest Common Prefix
def solution(strings):
    prefix=strings[0]
    for i in range(1,len(strings)):
        while not strings[i].startswith(prefix):
            prefix=prefix[:-1]
            if not prefix:
                return ""
    return prefix
def main():
    string=["yadhu","yashwanth","yashash"]
    print(solution(string))
if __name__=="__main__":
    main()
