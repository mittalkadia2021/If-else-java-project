public class Enter_Symbol_find_Addition
{//Input any two number ask user to enter their symbol (+,/,*,-)find out Addition ,Multiplication,
    //Subtraction, Division according to their symbol
    public static void entersymbolfindmultiplicationdivision()
    {
        int a = 20;
        int b = 10;
        char symbol = '/';

        if (symbol == '-')
        {
            System.out.println("Subsraction of" +" "+ a+ " "+ "And"+" " + b +" "+ "="+" "+(a - b));

        }
        else if (symbol == '+')
        {
            System.out.println("Addition of" +" "+ a+ " "+ "And"+" " + b +" "+ "="+" "+(a + b));
        }
        else if (symbol == '*')
        {

            System.out.println("Multiplication of" +" "+ a+ " "+ "And"+" " + b +" "+ "="+" "+(a * b) );
        }
        else if (symbol == '/')
        {

            System.out.println("Division of" +" "+ a+ " "+ "And"+" " + b +" "+ "="+" "+(a / b) );
        }
        else {
            System.out.println("Invalid");
        }
    }


    public static void main(String[] args) {

        entersymbolfindmultiplicationdivision();//call local method in main method
    }
}
