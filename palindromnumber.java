package Java;

import java.util.Scanner;

public class palindromnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		String num = sc.next();
		
		StringBuffer Sbuffer = new StringBuffer(num);
		StringBuffer rev= Sbuffer.reverse();
		System.out.println(rev);
		
		
		
		if (num.equals(rev.toString()))
		{
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Plindrom");
		}


	}

}
