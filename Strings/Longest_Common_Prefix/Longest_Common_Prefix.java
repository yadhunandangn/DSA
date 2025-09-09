// Longest Common Prefix

class Longest_Common_Prefix{
    public String Longestprefix(String[] str)
    {
        int n = str.length;
        String prefix=str[0];
        for(int i=1;i<n;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if ( prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        Longest_Common_Prefix LCP = new Longest_Common_Prefix();
        String[] arg={"yadhu","yashwanth","yashash"};
        System.out.println(LCP.Longestprefix(arg));
    }
}