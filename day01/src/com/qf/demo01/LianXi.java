package com.qf.demo01;

import java.util.Scanner;

public class LianXi {
	public static final double E = Math.E;
	public static final double PI = Math.PI;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		int i;
		j = j++;
		i = j++;
		int result;
		result = j + ++j * i++;
		System.out.println(result);
	}

}
