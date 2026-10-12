class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int n=strs.length;
        int m=strs[0].length();
         int p=0;
         int j=0;
         int i=0;
        while(j<m){
             char g=strs[0].charAt(j);
             i=0;
        while(i<n){
           if(j>=strs[i].length() || g!=strs[i].charAt(j)){
            p=1;
            break;
           }  
            i++;}   
        if(p==1){
            break;
        }else{
        str=str+g;
        
       j++;}
    }

    return str;
    }
}