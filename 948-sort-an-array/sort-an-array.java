class Solution {
   static void merge(int[] arr,int l,int r){
    if(l>=r){
        return ;
    }
    int mid=l+(r-l)/2;
    merge(arr,l,mid);
    merge(arr,mid+1,r);
    mergesort(arr,l,mid,r);
   }
   static void mergesort(int[] arr,int l,int mid,int r){
    int[] k=new int[r-l+1];
    int h=0;
    int i=l;
    int j=mid+1;
    while(i<=mid && j<=r){

    if(arr[i]<=arr[j]){
       k[h++]=arr[i]; 
       i++;
    }else{
        k[h++]=arr[j];
        j++;
    }
    }
    while(i<=mid){
        k[h++]=arr[i];
        i++;
        
    }
    while(j<=r){
        k[h++]=arr[j];
        j++;
    }
    for(i=l,h=0;i<=r;h++,i++){
        arr[i]=k[h];
    }
   }

    public int[] sortArray(int[] nums) {
       int l=0;
       int r=nums.length-1;
       merge(nums,l,r);   
       return nums;
    }

}