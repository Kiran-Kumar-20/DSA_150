//optimal solution with O(n) complexity using HashSet
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums){
            if(hs.contains(i)) return true;
            hs.add(i);
        }
        return false;
    }
}