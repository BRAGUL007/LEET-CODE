class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                a+=ch;
            }
        }
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);
        }
        return b.equals(a);  
    }
}