/**
 * Created by eero on 25/12/16.
 */
public class Exercise_9_4a {

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }
    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }
    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }
    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    public  static void main(String[]args){
        /**
         *1. Write some code in main that tests each of these methods. Make sure
         they work, and you understand what they do.
         *
         */
        String a="LOVE";
        System.out.println(first(a));
        System.out.println(rest(a));
        System.out.println(middle(a));
        System.out.println(length(a));
        printString(a);
        System.out.print(reverseString(a));
    }
    /**
     * 2. Using these methods, and without using any other String methods,
     write a method called printString that takes a string as a parameter
     and that displays the letters of the string, one on each line. It should be
     a void method.
     */
    public static void printString(String a) {
        System.out.println(first(a));
        String s = rest(a);
        if (length(s) >= 1) {
            printString(s);
        }
    }
    /**
     * 3. Again using only these methods, write a method called printBackward
     that does the same thing as printString but that displays the string
     backward (again, one character per line).???
     */
    /**
     *4. Now write a method called reverseString that takes a string as a pa-
     rameter and that returns a new string as a return value. The new string
     should contain the same letters as the parameter, but in reverse order.
     */
    public static String reverseString(String a){
        String newString="";
        for(int i=a.length()-1;i>=0;i--){
            newString=newString+a.charAt(i);
        }return newString;
    }
}
