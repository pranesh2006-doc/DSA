import java.util.*;
class chessboard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // Get number of queens
        int n = sc.nextInt();

        // Store queen positions
        int[][] queens = new int[n][2];

        // Get queen positions
        for(int i=0;i<n;i++){
            queens[i][0]=sc.nextInt();
            queens[i][1]=sc.nextInt();
        }
        
    }
}