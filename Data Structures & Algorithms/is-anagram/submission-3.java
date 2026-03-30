//freqArray Approach
//This is O(n) time and O(1) space (because the array size 26 is constant, regardless of how long the strings are).
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++; //incrementing the frequency
            freq[t.charAt(i)-'a']--; //decrementing the frequency
        }
        for(int i:freq) if(i!=0) return false;
        return true;
    }
}
