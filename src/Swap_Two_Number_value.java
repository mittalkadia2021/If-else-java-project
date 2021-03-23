public class Swap_Two_Number_value {

    public void swapnumbervalue()//Instance variable
    {//Input any two number and then print their interchanged value
        double a = 23.45d;
        double b = 12.87d;


        double temp = a;
        a = b;
        b = temp;
        System.out.println("A value is before 23.45, But now is  = " + a);
        System.out.println("B value is before 12.87, But now is =" + b);

    }

    public static void main(String[] args)
    { //Object create for instance method to call static method
        Swap_Two_Number_value swapTwoNumberValue = new Swap_Two_Number_value();
        swapTwoNumberValue.swapnumbervalue();
    }
}

