import java.util.*;
public class insertion {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      String[] arr=new String[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.next();
      }
for(int i=1;i<n;i++){
    String key=arr[i];
    int j=i-1;
    while(j>=0 && arr[j].compareTo(key)>0){
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=key;
}
     
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");   
}
    }
    
}
