package backtracking;

public class SudokuSolver{

    static void solveSudoku(char[][] board){
        solve(board, 0, 0);
    }

    static void solve(char[][] board, int row, int col){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }

        if(col>board.length-1){
            solve(board, row+1, 0);
            return;
        }

        if(board[row][col] != '.'){
            solve(board, row, col+1);
            return;
        }

        for(int i=1; i<=9; i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = (char)(i + '0');
                solve(board, row, col+1);
                board[row][col] = '.';
            }
        }
        return;
    }

    static void display(char[][] board){
        for(char[] row: board){
            for(char ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int num){

        int numChar = (char) num + '0';

        // check for row
        for(int i=0; i<9; i++){
            if(board[row][i] == numChar){
                return false;
            }
        }

        // check for column
        for(int i=0; i<9; i++){
            if(board[i][col] == numChar){
                return false;
            }
        }


        // for checking the 3 x 3 box

        int rowRange = ((row/3)+1) * 3 -1;
        int colRange = ((col/3)+1) * 3 -1;

        // check in the calculated range
        for(int i=rowRange-2; i<=rowRange; i++){
            for(int j= colRange-2; j<=colRange; j++){
                if(board[i][j] == numChar){
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args){
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(board);
    }
}