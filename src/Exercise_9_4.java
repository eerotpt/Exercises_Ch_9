/**
 * Created by eero on 21/12/16.
 */
public class Exercise_9_4 {

    public static boolean isPalindrome(String word) {

       // String newWord = word;

        if (word.length() % 2.0 != 0) {
            return false;
        }

        System.out.println(word);
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }else {
            if (word.charAt(0) == word.charAt(word.length() - 1) && (word.length() == 2)) {
                return true;
            }
            word = (word.substring(1, word.length() - 1));
            return isPalindrome(word);
        }
    }

    public static void main(String[] args){

        boolean s=isPalindrome("abccttcgba");
        System.out.print(s);
    }
}
