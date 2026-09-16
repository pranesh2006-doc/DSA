class Solution {
    public int findPeakElement(int[] nums) {
        int[] copy=nums.clone();
        int n=nums.length;
        Arrays.sort(copy);
        for(int i=0;i<n;i++){
            if(copy[n-1]==nums[i]){
                return i;
            }           
        }return 0;
    }
}