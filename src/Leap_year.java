import java.time.Year;
//Checking this year is leap year ya not
public class Leap_year {
    public static void leapyear()
    {
        int year = 1989;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("This year is leap year");
        } else {
            System.out.println("This year is not leap year");
        }
    }

    public static void main(String[] args) {
        leapyear();
    }
}








