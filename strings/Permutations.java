package strings;

import java.util.ArrayList;

public class Permutations{

    static ArrayList<String> permutations(String originalStr, String processedStr){
        ArrayList<String> arr = new ArrayList<>();

        if(originalStr.isEmpty()){
            arr.add(processedStr);
            return arr; 
        }
        char firstChar = originalStr.charAt(0);

        for(int i=0; i<=processedStr.length(); i++){

            String newPermutation = processedStr.substring(0,i) + firstChar + processedStr.substring(i, processedStr.length());
            arr.addAll(permutations(originalStr.substring(1), newPermutation));
        }

        return arr;
    }

    public static void main(String[] args){
        String str = "abc";

        System.out.println(permutations(str, ""));
    } 
}