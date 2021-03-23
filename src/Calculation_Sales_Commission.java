public class Calculation_Sales_Commission {

    public void commissionCalculation()//Instance method
    {

        int salesId = 34;
        String sellerName = " Paranav";
        long salaryBasic = 20000;
        int salesAmount = 8000;

        System.out.println("Sales ID NO :" +" " + salesId);
        System.out.println("Seller's Name :" + sellerName);
        System.out.println("Basic Salary :" + salaryBasic);

        if (salesAmount >= 50000) {
            double commission = (salesAmount * 0.35);//Commission Calculation and save in variable
            System.out.println("Commission = "+ commission);
        } else if (salesAmount >= 30000) {
            double commission = (salesAmount * 0.20);//Commission Calculation and save in variable
            System.out.println("Commission = "+ commission);
        } else if (salesAmount >= 20000) {
            double commission = (salesAmount * 0.10);//Commission Calculation and save in variable
            System.out.println("Commission = "+ commission);
        } else if (salesAmount >= 10000) {

            double commission = (salesAmount * 0.05);//Commission Calculation and save in variable
            System.out.println("Commission = "+ commission);

        } else {
            double commission = (salesAmount * 0.02);//Commission Calculation and save in variable
            System.out.println("Commission = " +commission);


        }

    }


    public static void main(String[] args) {
    //Create object for call instance method
        Calculation_Sales_Commission calculateSalesCommission = new Calculation_Sales_Commission();
        calculateSalesCommission.commissionCalculation();

    }
}
