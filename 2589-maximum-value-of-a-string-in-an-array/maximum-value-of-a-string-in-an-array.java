class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        int n=strs.length;
        for(int i=0;i<n;i++){
            if(isDigit(strs[i])){
                int value=Integer.parseInt(strs[i]);
                max=Math.max(max,value);
            }else{
                int value=strs[i].length();
                max=Math.max(max,value);
            }
              
           
        }return max;
    }
    static boolean isDigit(String s){
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)){
                return false;
            }
        }
    return true;
}}