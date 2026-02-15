package backtracking;

import java.util.ArrayList;

public class MazePathsAllDirections{

    static ArrayList<String> mazePaths(int rows, int cols, int startr, int startc, boolean[][] visited, String path){
        ArrayList<String> paths = new ArrayList<>();

        if(startr == rows-1 && startc == cols-1){
            paths.add(path);
            return paths;
        }

        if(visited[startr][startc]){
            return new ArrayList<>();
        }

        // mark the visited as true, so it doesn't visit it again
        visited[startr][startc] = true;

        // move Down
        if(startr<rows-1){
            paths.addAll(mazePaths(rows, cols, startr+1, startc, visited, path+"D"));
        }

        // move Right
        if(startc<cols-1){
            paths.addAll(mazePaths(rows, cols, startr, startc+1, visited, path+"R"));
        }

        // move Left
        if(startc>0){
            paths.addAll(mazePaths(rows, cols, startr, startc-1, visited, path+"L"));
        }

        // move Up
        if(startr>0){
            paths.addAll(mazePaths(rows, cols, startr-1, startc, visited, path+"U"));
        }

        // revert the changes and reset the path
        visited[startr][startc] = false;

        return paths;
    }


    public static void main(String[] args){
        int rows = 3;
        int cols = 3;
        boolean[][] visited = new boolean[rows][cols];
        System.out.println(mazePaths(rows, cols, 0, 0, visited, ""));
    }
}