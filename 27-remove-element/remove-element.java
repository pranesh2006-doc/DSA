class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
       
        for(int i=0;i<n;){
            if(nums[i]==val){
                for(int z=i;z<n-1;z++){
                nums[z]=nums[z+1];
                }
                n--;
               
            }
            else{
                i++;
            }
        }
        return n;
    }
}