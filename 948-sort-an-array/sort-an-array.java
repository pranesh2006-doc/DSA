class Solution {
       
       public void mergesort(int[] arr,int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
       }
       public void merge(int[] arr,int l,int mid,int h){
        int i=l;
        int j=mid+1;
        int k=0;
        int[] temp=new int[h+1];
        while(i<=mid && j<=h){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=h){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(i=l,k=0;i<=h;i++,k++){
            arr[i]=temp[k];
        }
       }
     public int[] sortArray(int[] nums) {
     int n=nums.length-1;
     mergesort(nums,0,n);
     return nums;
}

}