class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //brute force: for each word we go through the words
        //O(n^2) : for in for 
        // memory: O(1)- we dont allocate anything else 
        
        Map<String, List<String>> storage = new HashMap<>();

        // N * L log L
        for(String word: strs){
            //sorting: L log L
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            storage.putIfAbsent(sortedWord, new LinkedList<>());
            storage.get(sortedWord).add(word);
        } 
        return new ArrayList<>(storage.values());
    }
}
