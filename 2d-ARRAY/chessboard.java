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
        //get king position
        int[] king =new int[2];
        // Get king position
        king[0]=sc.nextInt();
        king[1]=sc.nextInt();
 
        //create a chessboard
        boolean[][] board=new boolean[8][8];

        //mark the positions of queens on the chessboard
        for(int i=0;i<n;i++){
            int row=queens[i][0];
            int col=queens[i][1];
            board[row][col]=true;
        }

        //eight possible direction for king movement
        int[][] directions={{-1,0},{1,0},{0,-1},{0,1},
                            {-1,-1},{-1,1},{1,-1},{1,1}};


      List<List<Integer>> result=new ArrayList<>();

      //check directions for king movement
      for(int i=0;i<directions.length;i++){
        int row=king[0]+directions[i][0];
        int col=king[1]+directions[i][1];

        //check if the position is within the chessboard
            
        while(row>=0 && row<8 && col>=0 && col<8){
            //check if the position is not occupied by a queen
            if(board[row][col]==true){
                List<Integer>position=new ArrayList<>();
                position.add(row);
                position.add(col);
                result.add(position);
                break;

            }
           row=row+directions[i][0];
         col=col+directions[i][1];
    }
    }
     //print the result
     System.out.println(result);
     sc.close();
    }}
