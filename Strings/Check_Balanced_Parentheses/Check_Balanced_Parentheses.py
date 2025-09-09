# Check Balanced Parentheses
def solution(s):
    stack=[]

    for ch in s:
        if ch=='(' or ch=='{' or ch=='[' :
            stack.append(ch)
        else:
            top=stack.pop()
            if ch==')' and  top!='(' or ch==']' and  top!='[' or ch=='}' and  top!='{' :
                return False
    return True

def main():
    print(solution("[{(}]"))

if __name__=="__main__":
    main()