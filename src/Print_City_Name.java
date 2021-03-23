public class Print_City_Name
{
    public static void findCityname()
    {//Input alphabet from a to f and print their city name
       char c ='D';

       if(c =='A'){
           System.out.println("City name is Ahmedabad");
       }
        else if (c =='B'){
           System.out.println(" City name is Baroda"  );
       }
       else if (c == 'C'){
           System.out.println("City name is Calcutta");
       }
       else if (c == 'D'){
           System.out.println("City name is delhi");
       }
       else if (c =='E'){
           System.out.println("City name is Ellahbad");
       }
       else if (c == 'F'){
           System.out.println("City name is Faridabad");
       }
       else {
           System.out.println("Invalid");
       }
        }



    public static void main(String[] args)
    {
        findCityname();
    }
}
