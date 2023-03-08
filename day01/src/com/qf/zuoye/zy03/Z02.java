package com.qf.zuoye.zy03;

public class Z02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 6; i++) {

			for (int j = 0; j < 6 - i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < 4 * i -3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 15; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {

			System.out.print("        ");
			for (int j = 0; j <= 4; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}
