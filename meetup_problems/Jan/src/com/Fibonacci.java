package com;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		System.out.println("Enter the index till the series should be printed");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		int result = fibonacci(number);
		System.out.println("The series : " + result);
		sc.close();
		
	}

	public static int fibonacci(int num){
		if(num<=0){
			System.out.println("Enter a positive number");
			return -1;
		}
		else if(num == 1){
			System.out.println("0");
			return 0;
		}
		else if(num == 2){
			System.out.println("0 1");
			return 1;
		}
		else{
			int first = 0;
			int second = 1;
			System.out.println(first);
			System.out.println(second);;
			int third=0;
			for(int i=0; i<num-2; i++){
				
				third = first + second;
				first = second;
				second = third;
				System.out.println(third);
				
			}
			return third;
		}
	}
}
