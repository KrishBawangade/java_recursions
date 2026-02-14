package backtracking;

import java.util.ArrayList;

public class MazePathsObstacle{

    static ArrayList<String> mazePaths(int rows, int cols, int startr, int startc, boolean[][] obstacles, String path){
        ArrayList<String> paths = new ArrayList<>();

        if(startr == rows-1 && startc == cols-1){
            paths.add(path);
            return paths;
        }

        if(obstacles[startr][startc]){
            return new ArrayList<>();
        }

        if(startr<rows-1){
            paths.addAll(mazePaths(rows, cols, startr+1, startc, obstacles, path+"D"));
        }

        if(startc<cols-1){
            paths.addAll(mazePaths(rows, cols, startr, startc+1, obstacles, path+"R"));
        }

        return paths;
    }


    public static void main(String[] args){
        int rows = 3;
        int cols = 3;
        boolean[][] obstacles = new boolean[rows][cols];
        obstacles[1][1] = true;
        System.out.println(mazePaths(rows, cols, 0, 0, obstacles, ""));
    }
}