public class Number_Positive_or_Negative {
    public static void NumberPositiveNegative()
    { //Find out any number condition positive, negative and zero
        int number = -23;//
        if (number > 0) //This condition for positive number
        {
            System.out.println(number + " " + " Number is Positive");
        } else if (number < 0)//This condition for negative number
        {
            System.out.println(number + " " + " Number is Negative");
        } else {
            System.out.println(" This Number is Zero");//This is zero number
        }

    }


    public static void main(String[] args) {
        NumberPositiveNegative();
    }
}
