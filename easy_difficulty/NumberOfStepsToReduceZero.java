public class NumberOfStepsToReduceZero{

    /*
    
        Given an integer num, return the number of steps to reduce it to zero.

        In one step, if the current number is even, 
        you have to divide it by 2, otherwise, you have to subtract 1 from it.
    
    */


    static int numberOfSteps(int num) {
        int steps = 0;
        return reduce(num, steps); // recusrsive function to count the steps
    }

    static int reduce(int num, int steps){
        if(num == 0){
            // if number is reduced to 0 return steps
            return steps;
        }

        if(num%2 == 0){
            // if even divide by 2
            return reduce(num/2, steps+1);
        }else{
            // else subtract 1
            return reduce(num-1, steps+1);
        }
    }

    public static void main(String[] args){
        int num = 4;

        System.out.println(numberOfSteps(num));
    }
}