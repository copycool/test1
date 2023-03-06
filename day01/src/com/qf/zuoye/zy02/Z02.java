package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 * 从键盘输⼊⼀个整数，判断是否能被3或者被5整除。能的话输出："该数是3或5的倍数",否则输 
 * 出："该数不能被3或5中的任何⼀个数整除"
 * @author XC
 *
 */
public class Z02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		i= scanner.nextInt();
		String r ;
		r=i%3==0||i%5==0?"该数是3或5的倍数":"该数不能被3或5中的任何⼀个数整除";
		System.out.println(r);
		
	}
}
