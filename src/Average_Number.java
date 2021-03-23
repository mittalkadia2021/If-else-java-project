public class Average_Number
{
    public void findoutaveragenumber() //instance method
    {//Input any five number then find average of five number
        int a = 5;
        int b = 10;
        int c = 12;
        int d = 7;
        int e = 22;
        double total = (a + b + c + d + e);//5+10+12+7+22
        int numberTotal = 5;
        double average = (total / numberTotal);
        System.out.println("Average =" + " " + average);

    }


    public static void main(String[] args)
    { //Object create call instance method in static method
        Average_Number averageNumber = new Average_Number();
        averageNumber.findoutaveragenumber();
    }
}

