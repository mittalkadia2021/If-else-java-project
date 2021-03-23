import java.util.Locale;

public class Alphabet_UpperCase_LowerCase {
    //Input alphabt in upper case and print in lower case
    public void printalphabetinuppercaseandlowercase()//instance variable
    {

        ;
        String char1 = "m";
        String char2 = "L";

        System.out.println(char1.toUpperCase());
        System.out.println(char2.toLowerCase());

    }


    public static void main(String[] args) {
        //create object for instance method to call in static method
        Alphabet_UpperCase_LowerCase alphabetUpperCaseLowerCase = new Alphabet_UpperCase_LowerCase();
        alphabetUpperCaseLowerCase.printalphabetinuppercaseandlowercase();


    }
}
