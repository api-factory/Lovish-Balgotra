package com.practice;
import java.util.*;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number");
		int b=s.nextInt();
		int num=b;
		int a=0;
		int z=0;
	
		while(b>0)
		{a=b%10;
		b=b/10;
		z=z+a*a*a;
		}
		System.out.println(z);
		if (z==num)
		{
			System.out.println("Number is palindrome");
	}
		else
		{
			System.out.println("Number is not palindrome");
	}

}
}
        