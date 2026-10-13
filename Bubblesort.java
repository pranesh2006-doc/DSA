import java.util.*;
public class Bubblesort {
    public static void bubbleSort(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr1=new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr1[j].compareToIgnoreCase(arr1[j+1])>0){
                    String temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }

}
}