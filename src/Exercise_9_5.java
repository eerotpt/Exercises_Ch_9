/**
 * Created by eero on 20/12/16.
 */
public class Exercise_9_5 {

    /**
     * Exercise 9.5 Write a method called isAbecedarian that takes a String and returns a
     *boolean indicating whether the word is abecedarian.
     *
     */

    public static boolean isAbecedarian(String word){
        boolean answer=false;
        for (int i=0;i<word.length()-1;i++){
            char letter1=word.charAt(i);
            char letter2=word.charAt(i+1);
            if (letter1<letter2){
                answer=true;
            }else {
                return false;
            }
        }return answer;
    }

    //Checking method isAbecedarian

    public static void main(String[] args) {
        String w = "abcdeftyz";
        System.out.print(isAbecedarian(w));
    }
}
