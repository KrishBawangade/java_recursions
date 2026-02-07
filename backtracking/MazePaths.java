package backtracking;

import java.util.ArrayList;

public class MazePaths{

    static ArrayList<String> mazePaths(int row, int col, String path){
        ArrayList<String> paths = new ArrayList<>();

        if(row == 1 && col == 1){
            paths.add(path);
            return paths;
        }

        if(row>1){
            paths.addAll(mazePaths(row-1, col, path+"D"));
        }

        if(col>1){
            paths.addAll(mazePaths(row, col-1, path+"R"));
        }

        return paths;
    }


    public static void main(String[] args){

        System.out.println(mazePaths(3,3, ""));
    }
}