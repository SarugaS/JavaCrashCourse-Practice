package com.lao.javalearning;

public class StrinBufferExamples {

	public static void main(String[] args) {
		// String Buffer Methods
		
		//Reverse
		StringBuffer name1 =new StringBuffer("Arulan");
		System.out.println(name1.reverse());
		
		//Replace
		StringBuffer name2 =new StringBuffer("Arulan");
		System.out.println(name2.replace(0, 3, "Riya"));

		//Delete
		StringBuffer name3=new StringBuffer("xyzRiya");
		System.out.println(name3.delete(0, 2));
		
		//Insert
		StringBuffer name4=new StringBuffer("Moni");
		System.out.println(name4.insert(4, "sha"));
		
		//Capacity
		System.out.println(name4.capacity());
		
		//Like String we have charAt,Substring,length methods as well.
		
		
	}

}
