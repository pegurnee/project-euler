package com.egurnee.project_euler.problems;

import com.egurnee.project_euler.util.EulerSolution;

/**
 * Work for Project Euler Problem 1
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
public class P001 extends EulerSolution {

	public static void main(String[] args) {
		int solution = 0;
		int limit = 1000;
		for (int x = 1; x < limit; x++) {
			if ((x % 3) == 0) {
				solution += x;
			} else if ((x % 5) == 0) {
				solution += x;
			}
		}
		System.out.println(solution);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
