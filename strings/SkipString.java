package strings;

public class SkipString{

    static String skipString(String originalStr, String skipStr){
        if(originalStr.isEmpty()){
            return "";
        }

        if(originalStr.startsWith(skipStr)){
            return skipString(originalStr.substring(skipStr.length()), skipStr);
        }

        return originalStr.charAt(0) + skipString(originalStr.substring(1), skipStr);
    }

    public static void main(String[] args){
        String s1 = "Hello";
        String res = skipString(s1, "ell");

        System.out.println(res);
    }
}