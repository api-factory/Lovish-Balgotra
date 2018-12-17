package com.practice;
import java.util.*;

public class Palindrome {	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int b=s.nextInt();					
String a=Integer.toString(b);
String var=new StringBuffer(a).reverse().toString();
if(a.equals(var))
{
	System.out.println("Number is palindrome");
}
else
{
	System.out.println("Number is not palindrome");
}
	}
}


