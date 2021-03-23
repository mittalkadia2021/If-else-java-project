public class Print_Weekdays_Name {


    public static void printDaysName()
    {//input any number, the print day name of the week accordingly
        int number = 1;
        if (number == 1)
        {
            System.out.println("Monday");
        }
        else if (number == 2)
        {
            System.out.println("Tuesday");
        }
        else if (number == 3)
        {
            System.out.println("Wednesday");
        }
        else if (number == 4)
        {
            System.out.println("Thursday");
        }
        else if (number == 5)
        {
            System.out.println("Friday");
        }
        else if (number == 6)
        {
            System.out.println("Saturday");
        }
        else if (number == 7)
        {
            System.out.println("Sunday");
        } else
            {
            System.out.println("This is invalid");
        }
    }


    public static void main(String[] args) {
        printDaysName();//call local method to main
    }
}
