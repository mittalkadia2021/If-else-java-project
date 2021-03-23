public class Student_percentage {
    public static void passorfailbasisonpercentag()
    {//According to student 3 subject marks find out total, percentage and check he is pass or fail
        String name = ("Riyana");
        int rollNo = 12;
        int mathsSubject = 67;
        int scienceSubject = 55;
        int englishSubject = 60;
        int total = (mathsSubject + scienceSubject + englishSubject);//total=182
        float percentage = total/3;//183/3=60.67
        System.out.println("Name :" +" " +  name);
        System.out.println("Roll no :" +" " + rollNo);
        if (percentage >= 80) {
            System.out.println("Result = " + "Pass");
            System.out.println("Grade = "+"A+");
        }
        else if (percentage >= 60) {
            System.out.println("Result = " + "Pass");
            System.out.println("Grade = "+"A");
        }
        else if (percentage >= 50) {
            System.out.println("Result = " + "Pass");
            System.out.println("Grade = "+"B");
        }
        else if (percentage >= 35) {
            System.out.println("Result = " + "Pass");
            System.out.println("Grade = "+"C");
        }
        else {
            System.out.println("Fail");
        }

    }
    public static void main(String[] args) {
     passorfailbasisonpercentag();//call local method to main method
    }
}
