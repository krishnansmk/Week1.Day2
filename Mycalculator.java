package week1.day1;

public class Mycalculator 
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		System.out.println(cal.add(5,5,5));
		System.out.println(cal.sub(7, 2));
		System.out.println(cal.mul(5, 4));
		System.out.println(cal.division(10,2));
	}
}
