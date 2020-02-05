//NumberFormat if the number is two digit then add '0' with the String and print it;If number is more than 2 digit then print the number itself


package com.capgemini.programtest.test;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {

		int count=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = sc.nextInt();
		int num1 = num;

		while(num!=0) {
			int rem = num%10;
			count++;
			num/=10;

		}

		if(count==2) {
			System.out.print(str+" "+0);
			System.out.print(num1);
		}
		else {
			System.out.print(str+" ");
			System.out.print(num1);
		}


	}

}
