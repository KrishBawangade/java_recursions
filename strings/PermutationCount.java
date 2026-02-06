package strings;

public class PermutationCount{

    static int countPermutations(String originalStr, String processedStr){
        int count = 0;

        if(originalStr.isEmpty()){
            return 1; 
        }
        char firstChar = originalStr.charAt(0);

        for(int i=0; i<=processedStr.length(); i++){

            String newPermutation = processedStr.substring(0,i) + firstChar + processedStr.substring(i, processedStr.length());
            int incCount = countPermutations(originalStr.substring(1), newPermutation);
            count+=incCount;
        }

        return count;
    }

    public static void main(String[] args){
        String str = "abcd";

        System.out.println(countPermutations(str, ""));
    } 
}