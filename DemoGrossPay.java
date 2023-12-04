// Chapter 3 example (page 124)

public class DemoGrossPay
{
	public static void main(String[] args) 
	{
		// local vaiables for the main() method
		double hours = 25;
		double yourHoursWorked = 37.5;
		
		// calls to the calculateGross() method
		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);
	} // end of main

	public static void calculateGross(double hours)
	{
		final double PAY_RATE = 13.75;
		double grossPay;
		grossPay = PAY_RATE * hours;

		System.out.println(hours + " hours at $" + PAY_RATE + " per hour is $" + grossPay);
	} // end of calculateGross() method
}