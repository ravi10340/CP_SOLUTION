class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> m = new HashMap<>();
        HashMap<Character,Character> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                if(m.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            if(h.containsKey(t.charAt(i))){
                if(h.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            m.put(s.charAt(i),t.charAt(i));
            h.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}