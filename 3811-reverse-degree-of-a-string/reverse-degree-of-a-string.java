class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int h='z'-ch+1;
            int m=(i+1)*h;
            sum=sum+m;
     }
     return sum;
    }
}