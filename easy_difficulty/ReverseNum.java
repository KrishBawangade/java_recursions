public class ReverseNum{

    static int reverseNum(int num, int rev){
        if(num<=0){
            return rev;
        }
        int digit = num%10;
        int newRev = rev*10 + digit;
        return reverseNum(num/10, newRev);
    }

    public static void main(String[] args){
        int num = 345;

        System.out.println(reverseNum(num, 0));
    }
}