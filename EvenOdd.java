package com.practice;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int b=s.nextInt();		
if (b>0)
{
	if(b%2==0)
	{System.out.println("Number is even");
}
	else
	{System.out.println("Number is odd");
	}

}
else if(b==0)
{
	System.out.println("Number is neither even nor odd");
	
}
else
	
{
	System.out.println("Number not valid");
}
	}
}
