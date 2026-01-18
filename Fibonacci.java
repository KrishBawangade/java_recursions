public class Fibonacci {

    static int fibonacci(int n){
        if(n<2){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    static int fibonacciFormula(int n){
        return (int) ( ((1/Math.sqrt(5)) * Math.pow( ( (1+Math.sqrt(5))/ 2 ), n) ) - ((1/Math.sqrt(5)) * Math.pow( ( (1-Math.sqrt(5))/ 2 ), n) ) );
    }

    public static void main(String[] args){
        System.out.println(fibonacciFormula(9));
    }
}
