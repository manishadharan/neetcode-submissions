class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sSorted = new String(charArr);

            res.putIfAbsent(sSorted, new ArrayList<>());
            res.get(sSorted).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
