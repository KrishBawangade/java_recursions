public class SumOfDigits{

    static int sumOfDigits(int num){
        if(num/10<=0){
            return num%10;
        }

        return (num%10) + sumOfDigits(num/10);
    }

    public static void main(String[] args){
        int num = 9864;
        int sum = sumOfDigits(num);

        System.out.println(sum);
    }
}