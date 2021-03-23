public class Student_Pass_fail {

   public static void studentneedtopassallsubject()
   { //According to student 3 subject marks find out pass or fail
       String name = ("Riyana");
       int rollNo = 12;
       int mathsSubject = 67;
       int scienceSubject =23;
       int englishSubject = 60;

       if (mathsSubject>=35 && scienceSubject >=35 && englishSubject >=35)
       {

           System.out.println("Student name = "   + name );
           System.out.println("Roll No = " + rollNo);
           System.out.println("Result = Pass ");
       }

       else {
           System.out.println("Student name = "   + name );
           System.out.println("Roll No = " + rollNo);
           System.out.println("Result = Fail");
       }
   }
   public static void main(String[]args)

    {
     studentneedtopassallsubject();
    }
}
