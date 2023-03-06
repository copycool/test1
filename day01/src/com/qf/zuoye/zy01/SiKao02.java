package com.qf.zuoye.zy01;

import java.util.Scanner;
import com.qf.demo01.MathQuYu;
import com.qf.zuoye.zy01.SiKao01;

/**
 * 某个公司采⽤公⽤电话传递数据，数据是四位的整数，在传递过程中是加密的， 加密规则如下：每位数字都加上3然后除以10的余数代替该数字，
 * 再将第⼀位和第四位交换，第⼆位和第三位交换。 输⼊四位号码，求加密后的号码为多少？
 * 
 * @author XC
 *
 */
public class SiKao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathQuYu quYu = new MathQuYu();

		int n = 1234;
		int[] a = quYu.quyu(n);
		for (int i = a.length-1; i >= 0; i--) {
			a[i] = (a[i] + 3 )%10;
		}
		swap(a, 0, 2);
		swap(a, 1, 3);
		System.out.println("加密后电话是：");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.printf(a[i] + "");
		}

	}

	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;

	}

}
