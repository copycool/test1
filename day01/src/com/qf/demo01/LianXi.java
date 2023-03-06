package com.qf.demo01;

import java.util.Scanner;

/**
 * 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下： 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
 * 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
 * 
 * @author XC
 *
 */
public class LianXi {
	public static final double E = Math.E;
	public static final double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 75 && score < 90) {
			System.out.println("良好");
		} else if (score >= 60 && score < 75) {
			System.out.println("及格");
		} else if (score < 60 && score >= 0) {
			System.out.println("不及格");
		} else {
			System.out.println("请输入正确的成绩");
		}
		System.out.println("执行结束");
	}

}
