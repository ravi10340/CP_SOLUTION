class Solution {
    public boolean isAnagram(String s, String t) {
            int[] a = new int[26];
            Arrays.fill(a,0);
            for(int i=0;i<s.length();i++){
                int k = s.charAt(i)-'a';
                a[k]++;
            }
            for(int i=0;i<t.length();i++){
                int k = t.charAt(i)-'a';
                a[k]--;
            }
            for(int i=0;i<26;i++){
                if(a[i]!=0){
                    return false;
                }
            }
        return true;
    }
}