//HashMap Approach (when string contains mix of lower and upper and case-sensitive)
//This is O(n) time, but the space complexity is O(k) where k is the number of unique characters.
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            hm.put(sch,hm.getOrDefault(sch,0)+1);
            hm.put(tch,hm.getOrDefault(tch,0)-1);
        }
        for(int x:hm.values()){
            if(x!=0) return false;
        }
        return true;
    }
}
