package com.lao.javalearning;

public class StringExamples {

	public static void main(String[] args) {
		// String methods and String concepts
		
		String name = "Agniprasath";   //String literal
		int number = 3;
		
		//Returns character value at particular index
		System.out.println(name.charAt(3));
		
		//return string length
		System.out.println(name.length());
		
		//checks the equality of the string with the given object
		System.out.println(name.equals("Agni"));
		
		//checks the equality of the string with the given string object without case sensitivity
		System.out.println(name.equalsIgnoreCase("AGNIPRASATH"));
		
		//checks if string is empty or not
		System.out.println(name.isEmpty());
		
		//returns true or false based on the the given values present or not
		System.out.println(name.contains("A"));
		
		//take  a particular portion of the string  (beginning index)
		System.out.println(name.substring(1));
		
		//take  a particular portion of the string  (beginning and end index)
		System.out.println(name.substring(1, 3));
		
		//appends the string to the given string
		System.out.println(name.concat("sara"));
		
		//replace existing character with given character
		System.out.println(name.replace("A","a"));
		System.out.println(name.replace("prasath", "sara"));
		
		//find the position of a character in a string
		System.out.println(name.indexOf("p"));
		//find the character from the specified index position
		System.out.println(name.indexOf("a", 7));
		//find the character from the specified index position
		System.out.println(name.indexOf("sath", 2));
		
		//trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		//convert the given data type to string
		System.out.println(String.valueOf(number));
		
		String uppercase ="RIYAPRASATH";
		System.out.println(uppercase.toLowerCase());
		
		String lowercase = "riyaprasath";
		System.out.println(lowercase.toUpperCase());
		
		//returns a joined string with given delimiter
		System.out.println(String.join("-", "Learn","Automation"));
		System.out.println(String.join("/", "28","05","1996"));
		
		//split
		String splitme = "Am,I,teaching,good,?";
		String [] splitted = splitme.split(",");
		for(String string:splitted) {
			System.out.print(string+" ");
		}

	}

}
