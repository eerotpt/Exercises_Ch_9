/**
 * Created by eero on 01/01/17.
 */
public class Exercise_9_8 {
    /**
     * Exercise 9.8 Write a method called canSpell that takes two strings and checks whether
     the set of tiles can spell the word. You might have more than one tile with
     the same letter, but you can only use each tile once.
     */
    public static boolean canSpell(String fromTiles,String wordTo) {
        if (fromTiles.length()<wordTo.length()){
            return false;
        }
        fromTiles = fromTiles.toLowerCase();
        wordTo = wordTo.toLowerCase();

        //Creating array for checking true or false
        int[] checkArray = new int[wordTo.length()];

        //String "fromTiles"and "wordTo" into character array
        char[] tiles = fromTiles.toCharArray();
        char[] word = wordTo.toCharArray();

        //Changing character to "space" in "word" and in "tiles"when a tile (character) from "tiles" is used.
        for (int i=0;i<word.length;i++){
            for (int ii=0;ii<tiles.length;ii++){
                if (word[i]==tiles[ii]){
                    word[i]=' ';
                    tiles[ii]=' ';
                    //Writing 1 to checkArray if corresponding character is within "tiles"
                    checkArray[i]=1;

                }
            }
        }
        //Checking if "canSpell" istrue.
        for (int c=0;c<checkArray.length;c++){
            if (checkArray[c]!=1){
                return false;
            }
        }
        return true;
    }


    //Checking method "canSpell".
    public static void main(String[]args){
        String a="FewLetters";
        String b="LETTERfews";
        System.out.print(canSpell(a,b));
    }
}
