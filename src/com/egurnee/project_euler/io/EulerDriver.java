package com.egurnee.project_euler.io;

import java.util.Scanner;

import com.egurnee.project_euler.problems.P001;
import com.egurnee.project_euler.problems.P002;
import com.egurnee.project_euler.problems.P003;
import com.egurnee.project_euler.problems.P004;
import com.egurnee.project_euler.problems.P011;
import com.egurnee.project_euler.problems.P012;
import com.egurnee.project_euler.problems.P013;
import com.egurnee.project_euler.problems.P014;
import com.egurnee.project_euler.problems.P020;
import com.egurnee.project_euler.problems.P049;
import com.egurnee.project_euler.problems.P050;
import com.egurnee.project_euler.util.EulerSolution;

public class EulerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner kb = new Scanner(System.in);

		System.out.println("Which problem would you like to view?");
		final int problemNumber = kb.nextInt();
		EulerSolution solution;
		switch (problemNumber) {
			case 1:
				solution = new P001();
				break;
			case 2:
				solution = new P002();
				break;
			case 3:
				solution = new P003();
				break;
			case 4:
				solution = new P004();
				break;
			case 11:
				solution = new P011();
				break;
			case 12:
				solution = new P012();
				break;
			case 13:
				solution = new P013();
				break;
			case 14:
				solution = new P014();
				break;
			case 20:
				solution = new P020();
				break;
			case 49:
				solution = new P049();
				break;
			case 50:
				solution = new P050();
				break;
			default:
				System.out.println("Incomplete");
				solution = null;
		}
		if (solution != null) {
			System.out.println(solution.getSolution());
		}

	}

}
