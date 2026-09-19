class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
       Map<String,List<String>> map = new HashMap<>();
       for(String s: str) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);

        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
    }}
