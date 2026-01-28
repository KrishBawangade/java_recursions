public class Palindrome{

    static int reverseNum(int num, int rev){
        if(num<=0){
            return rev;
        }
        int digit = num%10;
        int newRev = rev*10 + digit;
        return reverseNum(num/10, newRev);
    }
    
    public static void main(String[] args){
        int num = 546;
        int rev = reverseNum(num, 0);

        if(num == rev){
            System.out.printf("Number(%d) is a palindrome!", num);
        }else{
            System.out.printf("Number(%d) is not a palindrome!", num);
        }
    }
}