class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int i=0;
        String ans = "";
        int p = 0;
        while(i<n){
            int l = i-1;
            int r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            int len = r-l-1;
            if(len>p){
                p = len;
                ans = s.substring(l+1,r);
            }
             l = i;
             r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
             len = r-l-1;
            if(len>p){
                p = len;
                ans = s.substring(l+1,r);
            }
            i++;

        }
        return ans;
    }
}