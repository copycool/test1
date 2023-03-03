package com.qf.zuoye;

import java.util.Scanner;

/**
 * 从控制台输⼊学员王浩3⻔课程(Java、SQL、Php)成绩，编写程序实现 
	（1）Java课和SQL课的分数之差 
	（2）3⻔课的平均分 
 * @author XC
 *
 */
public class ZuoYe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =  new Scanner(System.in);
		int java,sql,php;
		System.out.println("请输入王浩同学的成绩：Java，SQL，Php分别是：");
		java  = scanner.nextInt();
		sql = scanner.nextInt();
		php = scanner.nextInt();
		System.out.printf("Java课和SQL课的分数之差：%d\n",java-sql);
		System.out.printf("3⻔课的平均分：%d",(java+sql+php)/3);
	}

}
