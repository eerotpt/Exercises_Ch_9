/**
 * Created by eero on 22/12/16.
 */
public class Exercise_9_6 {

    /**
     * Write a method called isDoubloon that takes a string and checks whether it is
     a doubloon. To ignore case, invoke the toLowerCase method before checking.
     *
     */

    public static boolean isDoubloon(String word){

        String same=word.toLowerCase();
        int[] histogram = new int[26];
        for (int i = 0; i <= word.length() - 1; i++){
            int letter = word.charAt(i);
            histogram[letter-97]++;
        }
        for (int i=0;i<26;i++){
            if (histogram[i]!=0 && histogram[i]!=2){
                return false;
            }
        }
        return true;
    }

    //Checking method isDoubloon

    public static void main(String[] args){
        System.out.print(isDoubloon("aqqssbddba"));
    }
}
