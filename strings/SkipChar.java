package strings;

public class SkipChar{

    static String skipChar(String originalStr, char ch, String skippedCharStr){
        if(originalStr.isEmpty()){
            return skippedCharStr;
        }

        if(originalStr.charAt(0) == ch){
            return skipChar(originalStr.substring(1), ch, skippedCharStr);
        }

        return skipChar(originalStr.substring(1), ch, skippedCharStr+originalStr.charAt(0));
    }

    public static void main(String[] args){
        String s1 = "Hello";
        String res = skipChar(s1, 'l', "");

        System.out.println(res);
    }
}