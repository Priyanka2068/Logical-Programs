package com.bridgelabz.logicalPrograms;

import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		
		int num;
		System.out.println(" Enter the Number ");
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
		
		for (int i=2; i<=num/2; i++) {
			if ( num % i !=0 ) {
				System.out.println(num + " Is Prime Number");
				break;
			}
			else
				System.out.println(num + " Is Not Prime Number");
			break;

		}
	}

}