class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int h=0;
            for(int j=i+1;j<n;j++){
                if(prices[i] >= prices[j]){
                     h=prices[j];
                    break;
                }
            }
            arr[i]=prices[i]-h;
        }
        return arr;
    }
}