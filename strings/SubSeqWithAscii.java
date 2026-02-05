package strings;

import java.util.ArrayList;

public class SubSeqWithAscii{

    static ArrayList<String> subSequences(String originalStr, String subSeqStr){
        ArrayList<String> arr = new ArrayList<>();
        if(originalStr.isEmpty()){
            if(!subSeqStr.isEmpty()){
                // return the subsequence if we reached a point where original str becomes empty
                // And avoid empty subsequence
                arr.add(subSeqStr);
            }
            return arr;
        }
        // add all elements returned from left side of recursion
        arr.addAll(subSequences(originalStr.substring(1), subSeqStr+originalStr.charAt(0)));

        // add all elements returned from right side of recursion
        arr.addAll(subSequences(originalStr.substring(1), subSeqStr));

        // add all elements that contains ascii value
        arr.addAll(subSequences(originalStr.substring(1), subSeqStr+(originalStr.charAt(0)+0)));

        return arr;
    } 

    public static void main(String[] args){
        String s1 = "abc";
        System.out.println(subSequences(s1, ""));
    }
}