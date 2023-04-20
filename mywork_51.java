import java.util.Scanner;
public class mywork_51
{

	public static void main(String[] args)
	{
		System.out.println("IF STATEMENT");
		Scanner s = new Scanner(System.in);
		int age;
		
		System.out.println("enter the age of the person");
		age=s.nextInt();
		if (age>=18)
		{
			System.out.println("the person can eleigible for vote");
		}
		else
		{
			System.out.println("the person is not eleigible for vote");
		}
		System.out.println("");
		System.out.println("if -else statement");
		System.out.println("neter the number");
		int n;
		n=s.nextInt();
		if (n%2==0)
		{
			System.out.println(n+"is  even number");
		}
		else
		{
			System.out.println(n+"is odd number");
		}
		System.out.println("");
		System.out.println("NESTED IF STATEMENT");
		System.out.println("enter the first number");
		int a,b,c;
		a=s.nextInt();
		System.out.println("enter the second number");
		b=s.nextInt();
		System.out.println("enter the third number");
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("the number "+a+" is largest");
		    
			}
			else 
			{
				System.out.println("the number"+c+" is largest");
			}
		}
		else
		{
			
			if(b>c)
			{
				System.out.println("the number"+b+" is largest");
			}	
		
			else
			{	
				System.out.println("the number"+c+" is largest");
			}
		}
		System.out.println("");
		System.out.println("else if statement");
		int marks;
		System.out.println("enter the marks");
		marks=s.nextInt();
		if (marks>=75)
			{
				System.out.println("distinction");
			}             
		else if(marks>=60 && marks<75)
		{
			System.out.println("first class");
		}
		else if (marks>=35 && marks<59)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}		
		
