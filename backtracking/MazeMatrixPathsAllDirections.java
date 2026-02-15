package backtracking;

import java.util.Arrays;

public class MazeMatrixPathsAllDirections{

    static void mazePaths(int rows, int cols, int startr, int startc, boolean[][] visited, String path, int [][] matrixPath, int step){

        if(startr == rows-1 && startc == cols-1){
            matrixPath[startr][startc] = step;
            for(int[] row: matrixPath){
                System.out.println(Arrays.toString(row));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        if(visited[startr][startc]){
            return;
        }

        // mark the visited as true, so it doesn't visit it again
        visited[startr][startc] = true;

        // mark the path as well with the step
        matrixPath[startr][startc] = step;

        // move Down
        if(startr<rows-1){
            mazePaths(rows, cols, startr+1, startc, visited, path+"D", matrixPath, step+1);
        }

        // move Right
        if(startc<cols-1){
            mazePaths(rows, cols, startr, startc+1, visited, path+"R", matrixPath, step+1);
        }

        // move Left
        if(startc>0){
            mazePaths(rows, cols, startr, startc-1, visited, path+"L", matrixPath, step+1);
        }

        // move Up
        if(startr>0){
            mazePaths(rows, cols, startr-1, startc, visited, path+"U", matrixPath, step+1);
        }

        // revert the changes and reset the path
        visited[startr][startc] = false;
        matrixPath[startr][startc] = 0;

    }


    public static void main(String[] args){
        int rows = 3;
        int cols = 3;
        boolean[][] visited = new boolean[rows][cols];
        int [][] matrixPath = new int[rows][cols];
        mazePaths(rows, cols, 0, 0, visited, "", matrixPath, 1);
    }
}