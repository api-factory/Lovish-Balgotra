package com.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringIntoDate {

	public static void main(String[] args) {
		
		String s="15-12-2018";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		try {
			date = sdf.parse(s);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
}
