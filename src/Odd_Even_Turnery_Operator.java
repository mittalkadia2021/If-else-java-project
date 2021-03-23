public class Odd_Even_Turnery_Operator
{
    public static void Modular() {
        int Number = 20;
        int number1 = 35;
        //Find out Odd or even number use turnery operator
        String result = (Number % 2 == 0) ? "Number 20 is odd" : "Number 20 is even";
        System.out.println(result);
        String result1 = (number1 % 2 == 0) ? "Number 35 is odd" : "Number 35 is even";
        System.out.println(result1);
    }
    public static void main(String[] args)
    {
        Modular();
    }
}
