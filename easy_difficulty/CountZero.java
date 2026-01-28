public class CountZero{

    static int countZero(int num, int count){
        if(num<=0){
            return count;
        }

        int newCount = count;

        if(num%10 == 0){
            newCount++;
        }

        return countZero(num/10, newCount);
    }

    public static void main(String[] args){
        int num = 305602;

        System.out.println(countZero(num ,0));
    }
}