  package com.practice;
  import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter your number");
int a=s.nextInt();
int c=0;
if(a>1)
{
for(int i=1;i<=a;i++)
{
	if(a%i==0)
	{
		c++;
	}

}
	if(c>2)
	{
		System.out.println("Number is not prime");
	}
	else
	{
		System.out.println("Number is prime");
	}
	}
else if (a==0 ||a==1)
{
	System.out.println("Number is not prime");
}
else
{
	System.out.println("Number is not relevant");
}
}
	
	
}
	


