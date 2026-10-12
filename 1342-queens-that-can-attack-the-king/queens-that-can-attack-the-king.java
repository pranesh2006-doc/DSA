

class Solution {
    public List<List<Integer>> queensAttacktheKing(
            int[][] queens, int[] king) {

        boolean[][] board = new boolean[8][8];

        // Mark all queen positions
        for (int[] queen : queens) {
            board[queen[0]][queen[1]] = true;
        }

        List<List<Integer>> result = new ArrayList<>();

        // Eight possible directions
        int[][] directions = {
            {-1, 0}, {1, 0},
            {0, -1}, {0, 1},
            {-1, -1}, {-1, 1},
            {1, -1}, {1, 1}
        };

        for (int[] direction : directions) {
            int row = king[0] + direction[0];
            int col = king[1] + direction[1];

            while (row >= 0 && row < 8 &&
                   col >= 0 && col < 8) {

                if (board[row][col]) {
                    result.add(
                        Arrays.asList(row, col)
                    );
                    break;
                }

                row += direction[0];
                col += direction[1];
            }
        }

        return result;
    }
}
