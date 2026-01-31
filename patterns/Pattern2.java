package patterns;


public class Pattern2{

    static void printPattern(int n){
        helper(n, 0);
    }

    static void helper(int row, int col){

        if(row == 1){
            System.out.print("*");
            return;
        }

        if(col<row){
            helper(row, col+1);
            System.out.print("* ");
        }else{
            helper(row-1, 0);
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 4;
        printPattern(n);
    }
}