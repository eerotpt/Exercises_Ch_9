/**
 * Created by eero on 21/12/16.
 */
public class Exercise_9_4 {

    /**
     * Write a recursive method named isPalindrome that takes a String and
     returns a boolean indicating whether the word is a palindrome.
     *
     */

    public static boolean isPalindrome(String word) {

        if (word.length() % 2.0 != 0) {
            return false;
        }
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

        boolean s=isPalindrome("abccccba");
        System.out.print(s);
    }
}
