public class Employee_salary_Calculation
{
    public static void EmployeegrosssalaryCalculation()
    {//Employee id, name, basic salary then find HRA, TA, DA, PF and gross salary

        int employeeId = 78;
        String employeeName = ("Ankita");
        long basicSalary = 20000;
        double hra = (basicSalary * .10);//Basic salary 10%
        double da = (basicSalary * 0.08);//Basic salary 8%
        double ta = (basicSalary * 0.09);//Basia salary 9%
        double pf = (basicSalary * 0.20);//basia salary 20%
        double gross = (basicSalary + hra + da + ta - pf);
        System.out.println("Employee ID NO :" +" " + employeeId);
        System.out.println("Name :" + employeeName);
        System.out.println("Basic Salary :" + basicSalary);
        System.out.println("HRA :" + hra);
        System.out.println("DA :"+ da);
        System.out.println("TA :"+ ta);
        System.out.println("PF :"+ pf);
        System.out.println("Gross Salary :"+ gross);
    }

    public static void main(String[] args)
    {
EmployeegrosssalaryCalculation();

    }
}
