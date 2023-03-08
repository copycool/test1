package com.qf.zuoye.zy02;

import java.util.Scanner;

/**
 *  会员购物时，根据输⼊积分的不同享受不同的折扣 
	计算会员购物时获得的折扣输出实付⾦额 
	会员积分x 折扣 
	x ＜ 2000 9折 
	2000 ≤ x ＜ 4000 8折 
	4000 ≤ x ＜ 8000 7折 
	x ≥ 8000 6折 
 * @author XC
 *
 */
public class Z05 {

	enum price{
		ada ,ad ,das 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int integral = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("请输入积分：");
		integral=scanner.nextInt();
//		System.out.println(integral/2000);
		switch (integral-Math.abs(integral)) {
		case 0:
			switch (integral/2000) {
			case 0:
				System.out.println("打九折"+"，实付金额："+integral*0.9);
				break;
			case 1:
				System.out.println("打八折"+"，实付金额："+integral*0.8);
				break;
			case 2:
				System.out.println("打七折"+"，实付金额："+integral*0.7);
				break;
			default:
				System.out.println("打六折"+"，实付金额："+integral*0.6);
				break;
			}
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		
		
	}

}
