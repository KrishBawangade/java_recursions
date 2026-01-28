public class ProductOfDigits{

    static int productOfDigits(int num){
        if(num/10<=0){
            return num%10;
        }

        return (num%10) * productOfDigits(num/10);
    }

    public static void main(String[] args){
        int num = 453;
        int product = productOfDigits(num);

        System.out.println(product);
    }
}