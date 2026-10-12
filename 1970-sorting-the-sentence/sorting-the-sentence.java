class Solution {
    public String sortSentence(String s) {
       
      String[] str=s.split(" ");
       int n=str.length;
       String[] res=new String[n];
       
        for(int i=0;i<n;i++){
           
           String ch=str[i];
           int word=ch.charAt(ch.length()-1)-'0';

           res[word-1]=ch.substring(0,ch.length()-1);
            
        }
        return String.join(" ",res);

    }
}