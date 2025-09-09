// Anagrams & Smallest Window Containing All Characters
// Problem number : 242
// problem : Given two strings s and t, return true if t is an anagram of s, and false otherwise.
import java.util.*;
public class Anagram{
    public boolean anagram(String s , String t){
        if(s.length()!=t.length()) return false;

        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);

    }

    public static void main(String[] args){
        Anagram an = new Anagram();
        boolean isAnagram = an.anagram("bat", "tab");
        System.out.println(isAnagram);
    }
}
