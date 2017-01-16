package com;
import java.util.Scanner;


public class Factorialjan7 {

	public static void main(String[] args) {
		int number;
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int result = factorial(number);
		System.out.println("Result :" + result);
		sc.close();
	}

	public static int factorial(int num){
		if((num==0) || (num==1)){
			return 1;
		}
		else 
		{
			return num * factorial(num-1);
		}
	}
}
