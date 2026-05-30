class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int mid = nums.length;
        System.out.println(mid);
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            
            
            ans[mid + i] = nums[i];
            
        }
        return ans;
    }
}