package week1.day1;

public class Calculator 
{
	public int add(int num1,int num2, int num3)
	{
		return (num1+num2+num3);
	}
	public int sub(int num1,int num2)
	{
		return (num1-num2);
	}
	public int mul(int num1,int num2)
	{
		return (num1*num2);
	}
	public int division(int num1,int num2)
	{
		return (num1/num2);
	}
	public static void main(String[] args) 
	{
		int val1=8,val2=2,val3=5;
				
		Calculator cal=new Calculator();
		System.out.println("Sum of three numbers.."+val1+" & "+val2+" & "+val3+" is.."+cal.add(val1,val2,val3));
		System.out.println("Difference of two numbers.."+val1+" & "+val2+" is.."+cal.sub(val1,val2));
		System.out.println("Product of two numbers.."+val1+" & "+val2+" is.."+cal.mul(val1,val2));
		System.out.println("Division of two numbers.."+val1+" & "+val2+" is.."+cal.division(val1,val2));
	}
}
