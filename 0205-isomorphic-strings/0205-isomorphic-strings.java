class Solution {
    public boolean isIsomorphic(String s, String t) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d= t.charAt(i);
            if(s.indexOf(c)!=t.indexOf(d)){
                return false;
            }
        }
        return true;
        
    }
}