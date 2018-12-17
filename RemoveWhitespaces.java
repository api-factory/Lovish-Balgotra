package com.practice;

import java.util.Scanner;

public class RemoveWhitespaces {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string");
		String a=s.nextLine();
		String b = a.replaceAll(" ","");
		System.out.println(b);

	}

}
