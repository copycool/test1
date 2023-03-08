package com.qf.zuoye.zy03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Paper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * 生成奖池
		 */
		Paper paper = new Paper();
		Scanner sca = new Scanner(System.in);
		int[] a = paper.getPrizePool();
		System.out.println("奖池：");
		System.out.println(Arrays.toString(a));
		/*
		 * 
		 * 选号
		 */
		int[] b = paper.getPrizePool();
		for (int i = 0; i < b.length; i++) {
			System.out.println("请选择第" + i + "个号码");
			b[i] = sca.nextInt();
		}
		System.out.println("选号是：");
		System.out.println(Arrays.toString(b));
		/*
		 * 
		 * 判断中奖
		 */
		paper.panduan(a, b);
		
	}

	/* 查找数组元素是否存在 */
	public boolean find(int[] a, int n) {
		for (int j = 0; j < a.length; j++) {
			if (a[j] == n) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/* 生成奖池 */
	public int[] getPrizePool() {
		int[] a = new int[4];
		a[0] = new Random().nextInt(100);
		for (int i = 1; i < a.length; i++) {
			do {
				a[i] = new Random().nextInt(100);
			} while (find(a, a[i]));
		}
		return a;
	}

	/* 判断是否中奖*/
	public int[] equlenum(int[] a, int[] b) {
		int[] result = { 0, 0 };
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				if (a[i] == b[i]) {
					result[0]++;
					result[1] = 1;
				}
			} else {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						result[0]++;
						result[1] = 1;
					}
				}
			}
		}
		return result;
	}
	/*判断奖金*/
	public void panduan(int[] a,int[] b){
		Paper paper = new Paper();
		int[] result = paper.equlenum(a, b);
		switch (result[1]) {
		case 1:
			switch (result[0]) {
			case 1:
				System.out.println("奖金10元");
				break;
			case 2:
				System.out.println("奖金100元");
				break;
			case 3:
				System.out.println("奖金1000元");
				break;
			case 4:
				System.out.println("奖金100000元");
				break;
			default:
				System.err.println("系统错误");
				break;
				}
			break;
		case 0:
			System.out.println("很遗憾，下次一定");
		default:
			break;
			
		}
	}
}
