# Anagrams & Smallest Window Containing All Characters
def anagram(s,t)->bool:
    if len(s)!=len(t):
        return False

    sSorted=sorted(s)
    tSorted=sorted(t)

    return sSorted==tSorted
def main():
    print(anagram("bat","tab"))
if __name__=="__main__":
    main()


