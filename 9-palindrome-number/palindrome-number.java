class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
   int h=x;   
int k=0;
while(x!=0){
int d=x%10;
k=(k*10)+d;
x=x/10;
}
if(k==h){
    return true;
}
        return false;
    }
}