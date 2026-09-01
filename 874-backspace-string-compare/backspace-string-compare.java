class Solution {
    public boolean backspaceCompare(String s, String t) {
        int r=s.length()-1;
        int m=t.length()-1;
        String j="";
        String l="";
      int c=0;
     while(r>=0){
        if(s.charAt(r)=='#'){
            c++;
        }else if(c>0){
            c--;
        }
        else{
            j=j+s.charAt(r);
        }r--;
        }c=0;
        while(m>=0){
            if(t.charAt(m)=='#'){
                c++;
            }else if(c>0){
                c--;
            }
            else{
                l=l+t.charAt(m);
            }m--;
        }
        if(j.equals(l)){
            return true;
        }
return false;
    }
}