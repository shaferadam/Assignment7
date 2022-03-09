package com.CEN4028.web;

import java.util.Random;

public class Utilities 
{
	
	public static String makeItLower(String data)
	{
		return data.toLowerCase();
	}
	
	
	public static int randomInt()
	{
		Random rnd = new Random(90);
		
		return rnd.nextInt();
	}

}
