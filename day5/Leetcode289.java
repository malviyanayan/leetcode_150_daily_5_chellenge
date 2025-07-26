class Leetcode289 {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;

        // make new board
        int[][] newboard = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newboard[i][j] = board[i][j];
            }
        }

        // traverse all i,j th location and then calculate each position
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count = countNieghbors(i, j, newboard);
                if(count == 3 && newboard[i][j] == 0)board[i][j] = 1;
                if(count < 2 || count > 3)board[i][j] = 0;
            }
        }

 
    }

    static int countNieghbors(int i, int j, int[][] board) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;

        // left 
        if(j != 0 && board[i][j-1] == 1)count++;

        // right
        if(j != n && board[i][j+1] == 1)count++;
        
        // top
        if(i != 0 && board[i-1][j] == 1)count++;
        
        // down
        if(i != m && board[i+1][j] == 1)count++;
        
        // left up
        if(i != 0 && j != 0 && board[i-1][j-1] == 1)count++;
        
        // right up
        if(i != 0 && j != n && board[i-1][j+1] == 1)count++;
        
        // left down
        if(i != m && j != 0 && board[i+1][j-1] == 1)count++;
        
        // right down
        if(i != m && j != n && board[i+1][j+1] == 1)count++;

        return count;
    }

}