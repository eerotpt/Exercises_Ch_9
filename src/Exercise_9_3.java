/**
 * Created by eero on 01/01/17.
 */
public class Exercise_9_3 {

    /**
     * Exercise 9.3 The purpose of this exercise is to review encapsulation and
     generalization (see Section 7.3). The following code fragment traverses a string
     and checks whether it has the same number of open and close parentheses:
     */
    /**
     * 1. Encapsulate this fragment in a method that takes a string argument and
     returns the final value of count.
     */
    /**
     * 2. Now that you have generalized the code so that it works on any string,
     what could you do to generalize it more?
     ANSWER:making constant "count" to be a parameter.Also "i" could be a parameter.
     * 3. Test your method with multiple strings, including some that are balanced
     and some that are not.
     */
    public static int parenthesesCheck(String s,int count){

        for ( int i=0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' ) {
                count++;
            } else if (c == ')' ) {
                count--;
            }
        }
        return count;
    }
    // Checking method parenthesesCheck
    public static void main(String[]args){
        String s = "((3 + 7) * 2)";
        System.out.println(parenthesesCheck(s,1));
    }
}
