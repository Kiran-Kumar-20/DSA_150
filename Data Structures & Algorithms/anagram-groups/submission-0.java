//Time Complexity: O(N.LlogL) => We sort each of the N strings of length L
//Space Complexity: $O(N.L) => We store all characters of all strings in the HashMap
//If the string lengths are too large, we can use a frequency counting
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char temp[]=strs[i].toCharArray();
            Arrays.sort(temp);
            //Here k -> new Arraylist<>() is a lambda function which creates an arraylist object only if needed
            // and the k is populated with the key value that we used to search in hashmap
            hm.computeIfAbsent(new String(temp),k->new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hm.values());        
    }
}
