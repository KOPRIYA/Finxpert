import java.lang.*;
import java.util.Scanner;
class FV
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value: ");
	      double present_val=sc.nextInt();
	      System.out.print("Enter the interest rate in percentage: ");
	      double r = sc.nextInt();
        System.out.print("Is the above entered interest rate, annual percentage rate: ");
        String s = sc.nextLine();
        if (s.contains("N") OR s.contains("n")){
          System.out.print("Enter the frequency of compounding, please: ");
          double m = sc.nextInt();
          r = Math.pow((1+r/m),m);
        }
        
	      System.out.print("Enter the time period in years: ");
	      double n = sc.nextInt();
	      double fv = present_val * Math.pow((1+r/100),n);
	      System.out.print("Future value of: " +present_val + "at an interest rate of: " +r + "is: " +fv);
  }
}
