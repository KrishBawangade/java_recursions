package backtracking;

public class Maze{

    static int countPaths(int row, int col){
        int count = 0;
        if(row == 1 && col == 1){
            return 1;
        }

        if(row>1){
            count+= countPaths(row-1, col);
        }

        if(col>1){
            count+= countPaths(row, col-1);
        }

        return count;
    }


    public static void main(String[] args){
        int totalPaths = countPaths(3,3);

        System.out.println(totalPaths);
    }
}