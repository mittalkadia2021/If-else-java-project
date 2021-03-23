public class Odd_Even_Turnery_Operator
{
    public static void Modular() {
        int Number = 20;
        int number1 = 41;
        //Find out Odd or even number use turnery operator
        String result = (Number % 2 == 0) ? "Number "+ Number + " is even" : "Number"+  Number + " is odd";
        System.out.println(result);
        String result1 = (number1 % 2 == 0) ? "Number"+ number1 + " is even" : "Number "  + number1 + " is odd";
        System.out.println(result1);
    }
    public static void main(String[] args)
    {
        Modular();
    }
}
