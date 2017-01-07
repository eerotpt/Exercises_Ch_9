/**
 * Created by eero on 07/01/17.
 */
public class Exercise_9_1 {

    /**
     * Exercise 9.1
     * Make a bigger copy of the following table and fill it in. At the intersection
     *of each pair of types, you should indicate whether it is legal to use the
     *+ operator with these types, what operation is performed (addition or
     *concatenation), and what the type of the result is.
     *
//   /*         |  boolean     char    int    double   String
//    ----------|--------------------------------------------
//    boolean   |    -         -       -       -      string
//    char      |    -         int    int    double   string
//    int       |    -         int    int    double   string
//    double    |    -       double  double  double   string
//    String    |  string    string  string  string   string
//
      What happens when you add "" (the empty string) to the other types,
      for example, "" + 5?
   ANSWER: they all change to string.
//
     For each data type, what types of values can you assign to it? For
     example, you can assign an int to a double but not vice versa.
   ANSWER:also legal to assign char to a double and char to an int.


     */
    public static void main(String[]args){
        boolean a=true;
        char letter='s';
        int number=9;
        double figure=1.5;
        String word="tele";

       letter++;
       System.out.println(letter);
        System.out.println(""+word);
        String aa=""+word;
        int ab=letter;
        double abc=letter;
        System.out.print(figure);

    }
}
