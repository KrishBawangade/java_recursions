package backtracking;

import java.util.ArrayList;

public class MazePathsDiagonal{

    static ArrayList<String> mazePaths(int row, int col, String path){
        ArrayList<String> paths = new ArrayList<>();

        if(row == 1 && col == 1){
            paths.add(path);
            return paths;
        }

        // move vertical
        if(row>1){
            paths.addAll(mazePaths(row-1, col, path+"V"));
        }

        // move horizontal
        if(col>1){
            paths.addAll(mazePaths(row, col-1, path+"H"));
        }

        // move diagonal
        if(row>1 && col>1){
            paths.addAll(mazePaths(row-1, col-1, path+"D"));
        }

        return paths;
    }


    public static void main(String[] args){

        System.out.println(mazePaths(3,3, ""));
    }
}