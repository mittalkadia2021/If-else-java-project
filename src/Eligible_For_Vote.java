public class Eligible_For_Vote
{//Person who eligible for vote must be older than oe equal to 18 years

    public static void personeligibleforvote()
    {
        int age = 16;
        if (age >= 18) {

            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not Eligible for vote");
        }

    }

    public static void main(String[] args) {
        personeligibleforvote();

    }

}