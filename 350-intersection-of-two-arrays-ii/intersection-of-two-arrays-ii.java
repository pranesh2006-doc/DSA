class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
           
        int[] arr = new int[Math.min(n, m)];   

        int k=0;
        if(n>m){
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(nums2[i]==nums1[j]){
                  arr[k++]=nums2[i];
                  nums1[j]=-1;
                  break;
              }
            }
        }
        }else{
              for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(nums1[i]==nums2[j]){
                  arr[k++]=nums1[i];
                  nums2[j]=-1;
                  break;
              }
            }
        }
        }
     int[] result=Arrays.copyOf(arr,k);  
        return result;
    }
}