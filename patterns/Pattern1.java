package patterns;


public class Pattern1{

    static void printPattern(int n){
        helper(n, 0);
    }

    static void helper(int row, int col){

        if(row == 0){
            return;
        }

        if(col<row){
            System.out.print("* ");
            helper(row, col+1);
        }else{
            System.out.println();
            helper(row-1, 0);
        }
    }

    public static void main(String[] args){
        int n = 4;
        printPattern(n);
    }
}