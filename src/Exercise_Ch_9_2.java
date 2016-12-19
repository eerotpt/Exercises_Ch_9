/**
 * Created by eero on 19/12/16.
 */
public class Exercise_Ch_9_2 {

    /**
     * Exercise 9.2 Write a method called letterHist that takes a string as a
     parameter and returns a histogram of the letters in the string. The zeroth
     element of the histogram should contain the number of a’s in the string (upper-
     and lowercase); the 25th element should contain the number of z’s. Your
     solution should only traverse the string once.
     */

    public static int[] letterHist(String a){

        String allUp = a.toUpperCase();
        int[] histogram = new int[26];

        for (int i = 0; i <= a.length() - 1; i++) {
            int letter = allUp.charAt(i);
            histogram[letter - 65]++;
        }
        return histogram;
    }

    //Checking method letterHist

    public static void main(String[] args){
        int[] histogram = letterHist("vegetables");
        for (int b : histogram){
            System.out.print(b + " ");
        }
    }
}
