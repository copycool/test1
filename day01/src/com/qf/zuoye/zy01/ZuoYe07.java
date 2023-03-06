package com.qf.zuoye.zy01;

import java.util.Scanner;

/**
 * 从控制台输⼊基本⼯资，题⽬1、计算输出实领⼯资 题⽬2、 输出⼀张完整的⼯资条 其中物价津贴为基本⼯资的4% 
 * 房租津贴为基本⼯资的2.5%
 * 社保为基本⼯资1.25% 话费补贴为100
 *
 * @author XC
 *
 */
public class ZuoYe07 {
	static int Phone_Charge = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double salary;
		double priceAllowance, rentAllowance, socialSecurity;
		System.out.println("请输入基本工资：");
		salary = scanner.nextDouble();
		priceAllowance = salary * 4 / 100;
		rentAllowance = salary * 2.5 / 100;
		socialSecurity = salary * 1.25 / 100;
		// 题目1
		double realSalary = salary + priceAllowance + rentAllowance + socialSecurity + Phone_Charge;
		System.out.println("实际工资是" + realSalary);
		//题目2
		System.out.printf("名称\t基本工资\t物价津贴\t房租津贴\t社保\t话费\t实领⼯资\t\n");
		System.out.printf("数目\t%.2f\t%.2f\t%.2f\t%.2f\t%d\t%.2f\t",salary,priceAllowance,rentAllowance,socialSecurity,Phone_Charge,realSalary);
	}

}
