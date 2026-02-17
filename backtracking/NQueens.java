package backtracking;

import java.util.Arrays;

public class NQueens{

    static int placeNQueens(boolean[][] board, int row){
        int count = 0;
        if(row == board.length){
            display(board);
            return 1;
        }

        for(int col=0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count+=placeNQueens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;

    }

    static boolean isSafe(boolean[][] board, int row, int col){
        // function to check if the queen is safe to place on the board or not


        // for vertical direction upwards
        for(int i=row-1; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }

        // for left diagonal
        int i=row-1;
        int j=col-1;

        while(i>=0 && j>=0){
            if(board[i][j]){
                return false;
            }
            i--;
            j--;
        }


        // for right diagonal
        i=row-1;
        j=col+1;

        while(i>=0 && j<board.length){
            if(board[i][j]){
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    static void display(boolean[][] board){
        for(boolean[] row: board){
            for(boolean isPlaced: row){
                if(isPlaced){
                    System.out.print("Q ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        boolean[][] board = new boolean[4][4];

        System.out.println(placeNQueens(board, 0));
    }
}