import java.lang.*;
import java.util.Scanner;
class PVA
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the annuity amount : ");
	      double annuity_val=sc.nextInt();
	      System.out.print("Enter the interest rate in percentage: ");
	      double r = sc.nextInt();
	      System.out.print("Enter the time period in years: ");
	      double n = sc.nextInt();
	      double pva = annuity_val * ((1-1/Math.pow((1+r/100),n))/(r/100));
	      System.out.print("Present value of the annuity: " +annuity_val + "at an interest rate of: " +r + "is: " +pva);
  }
}
