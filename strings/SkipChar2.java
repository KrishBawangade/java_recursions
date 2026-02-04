package strings;

public class SkipChar2{

    static String skipChar(String originalStr, char ch){
        if(originalStr.isEmpty()){
            return "";
        }

        if(originalStr.charAt(0) == ch){
            return skipChar(originalStr.substring(1), ch);
        }

        return originalStr.charAt(0)+ skipChar(originalStr.substring(1), ch);
    }

    public static void main(String[] args){
        String s1 = "Hello";
        String res = skipChar(s1, 'l');

        System.out.println(res);
    }
}