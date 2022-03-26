package com.StringBufferrAndStringBuilder;

public class Example2 
{

	public static void main(String[] args) 
	{		
		
		StringBuffer name = new StringBuffer("Anu");
		
		name.append(" Sri");
		
		System.out.println(name);	
		
		System.out.println("=============");
		
		StringBuilder myName = new StringBuilder("vijay");
		
		myName.append(" kumar");
		
		System.out.println(myName);
		
	}

}

