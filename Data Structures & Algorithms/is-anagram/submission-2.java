//freqArray Approach
//This is O(n) time and O(1) space (because the array size 26 is constant, regardless of how long the strings are).
class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        boolean flag=true;
        for(int i=0;i<s.length();i++) freq[s.charAt(i)-'a']++; //filling the freqArray with the character frequencies of 's'
        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a']<=0) return false;
            freq[t.charAt(i)-'a']--;
        }
        for(int i:freq) if(i!=0) return false;
        return true;
    }
}
