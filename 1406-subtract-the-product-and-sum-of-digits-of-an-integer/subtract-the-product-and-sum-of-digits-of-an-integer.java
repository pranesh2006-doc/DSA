class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int multi=1;
        
     while(n!=0){
            int m = n%10;
            sum=sum+m;
            multi=multi*m;
          n=n/10;
        }
       int g=multi-sum;
    
    return g;
    }
}