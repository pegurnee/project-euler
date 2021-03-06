package com.egurnee.project_euler.problems;

import com.egurnee.project_euler.util.EulerSolution;

/**
 * Work for Project Euler Problem 14
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class P014
	extends EulerSolution {
	protected static int testCount = 0;

	public static void collatzSeq(long num) {
		if (num == 1) {
		} else if ((num % 2) == 0) {
			collatzSeq(num / 2);
		} else {
			collatzSeq((num * 3) + 1);
		}
		testCount++;
	}

	public static void main(String[] args) {
		long limit = 1000000, solution = 0;
		int highestCount = 0;

		for (long i = 1; i < limit; i++) {
			testCount = 0;
			collatzSeq(i);
			if (testCount > highestCount) {
				highestCount = testCount;
				solution = i;
			}
		}
		System.out.println(solution + " " + highestCount);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long limit = 1000000, solution = 0;
		int highestCount = 0;

		for (long i = 1; i < limit; i++) {
			testCount = 0;
			collatzSeq(i);
			if (testCount > highestCount) {
				highestCount = testCount;
				solution = i;
			}
		}

		this.solution = solution + " " + highestCount;
	}
}
