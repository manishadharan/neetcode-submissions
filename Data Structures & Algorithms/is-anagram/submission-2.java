class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for(char c: chars) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        char[] chars1 = t.toCharArray();
        for(char c:chars1) {
            if(!map.containsKey(c)){
                return false;
            }
            int count = map.get(c)-1;
            if(count ==0){
            map.remove(c);
            }
            else{
            map.put(c,count);
            }
        }
        
    return map.isEmpty();
    }
}

