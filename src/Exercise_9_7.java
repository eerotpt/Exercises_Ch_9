/**
 * Created by eero on 23/12/16.
 */
public class Exercise_9_7 {

    /**Exercise 9.7
     * Write a method that takes two strings and checks whether they are anagrams
     of each other.
     *
     */

    public static boolean areAnagrams(String a, String b){
        if (a.length()!=b.length()){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();

        //Creating arrays for histograms
        int [] histogramA=new int[150];
        int [] histogramB=new int[150];

        //Creating histograms of strings
        for (int i=0;i<a.length();i++){
            histogramA[a.charAt(i)]= histogramA[a.charAt(i)]+1;
            histogramB[b.charAt(i)]= histogramB[b.charAt(i)]+1;
        }

        //Comparing histograms of strings
        for (int i=0;i<150;i++){
            if (histogramA[i]!=histogramB[i]){
                return false;
            }
        }return true;
    }

    //Checking method areAnagrams
    public static void main(String[] args){
        String a="sss123";
        String b="1S2S3S";
        System.out.print(areAnagrams(a,b));
    }
}
