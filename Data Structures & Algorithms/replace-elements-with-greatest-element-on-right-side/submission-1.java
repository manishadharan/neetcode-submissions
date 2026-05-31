class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
           int r = -1;
        for(int i=arr.length-1; i>=0; i--) {
            
            ans[i] = r;
            r=Math.max(r,arr[i]);
        }
        return ans;
    }
}