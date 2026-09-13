class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] copy = nums.clone();
          int m=nums.length;
          int l=0;
          int r=n;
          int i=0;
          while(r<m){
            if(i%2==0){
                copy[i]=nums[l];
                l++;
            }else{
                copy[i]=nums[r];
                r++;
            }
            i++;
          }
          return copy;
    }
}