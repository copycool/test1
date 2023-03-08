package com.qf.zuoye.zy03;

import java.util.Arrays;

/**
 * 同一奖池多张彩票抽奖
 * @author XC
 *
 */
public class ChouJang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper paper = new Paper();
		int [] a =paper.getPrizePool();
		System.out.println("奖池:");
		System.out.println(Arrays.toString(a));
		System.out.println("****************");
		for (int i = 0; i < 10; i++) {
			int[] b = paper.getPrizePool();
			System.out.println("选号是:");
			System.out.println(Arrays.toString(b));
			paper.panduan(a, b);
			System.out.println();
		}
	}

}
