class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : str) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorteds = new String(charArr);
            
            if(!map.containsKey(sorteds)){
                map.put(sorteds, new ArrayList<>());
            }
            List<String> list = map.get(sorteds);
            list.add(s);
        }
        return new ArrayList<>(map.values());
    }
}
