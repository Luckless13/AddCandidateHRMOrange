package com.juaracoding.cucumber.utils;

import java.util.Scanner;

public class testbaru {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
		int x,y,a=10;
		
//		System.out.print("Input Angka : ");
//		a=input.nextInt();
		
		for(x=1; x<=a; x++) {
			for(y=x; y<=a; y++) {
				System.out.print(y+ " ");
			}

			System.out.println();
		}
		System.out.println();
	}
	
}
