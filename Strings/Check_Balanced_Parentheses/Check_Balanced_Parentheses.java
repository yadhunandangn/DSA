// Check Balanced Parentheses
//problem no = 20
import java.util.*;
public class Check_Balanced_Parentheses{
    public boolean check(String arr){
        Stack<Character> st=new Stack<>();

        for(char ch : arr.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            //if (st.isEmpty()) return false;

            else{
                if (st.isEmpty()) return false;
                char top = st.pop();
                if(ch=='(' && top!=')' ||
                ch=='{' && top!='}' ||
                ch=='[' && top!=']'){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        Check_Balanced_Parentheses ch=new Check_Balanced_Parentheses();
        boolean ans = ch.check("(({[]}))");
        System.out.println(ans)
;    }
}

