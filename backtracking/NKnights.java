package backtracking;

public class NKnights{

    static int placeNKnights(boolean[][] board, int row, int col, int n){
        int count = 0;

        if(n==0){
            display(board);
            return 1;
        }

        if(row == board.length-1 && col == board.length){
            return count;
        }

        if(col == board.length){
            count+=placeNKnights(board, row+1, 0, n);
            return count;
        }


        if(isSafe(board, row, col)){
            board[row][col] = true;
            count+=placeNKnights(board, row, col+1, n-1);
            board[row][col] = false;
        }
            
        count+=placeNKnights(board, row, col+1, n);

        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // function to check if the knight is safe to place on the board or not


        // for horizontal left side
        int i = row -1;
        int j=col-2;

        if(i>=0 && j>=0 && board[i][j]){
            return false;
        }

        // for horizontal right side
        i = row -1;
        j=col+2;

        if(i>=0 && j<board.length && board[i][j]){
            return false;
        }
        
        // for vertical left side
        i = row -2;
        j=col-1;

        if(i>=0 && j>=0 && board[i][j]){
            return false;
        }

        // for vertical right side
        i = row -2;
        j=col+1;

        if(i>=0 && j<board.length && board[i][j]){
            return false;
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean isPlaced: row){
                if(isPlaced){
                    System.out.print("N ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(placeNKnights(board, 0, 0, n));
    }
}