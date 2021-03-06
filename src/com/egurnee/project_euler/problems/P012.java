package com.egurnee.project_euler.problems;

import com.egurnee.project_euler.util.EulerLibrary;
import com.egurnee.project_euler.util.EulerSolution;

/**
 * Work for Project Euler Problem 12
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */

public class P012
extends EulerSolution {

	public static void main(String[] args) {
		long triangle = 0;
		int numFactors = 0;
		for (int i = 1; numFactors < 500; i++) {
			triangle += i;
			numFactors = 0;
			if (EulerLibrary.isPerfectSquare(triangle)) {
				numFactors++;
			}
			for (int j = 1; j <= Math.sqrt(triangle); j++) {
				if ((triangle % j) == 0) {
					numFactors += 2;
				}
			}
		}
		System.out.println(triangle);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long triangle = 0;
		int numFactors = 0;
		for (int i = 1; numFactors < 500; i++) {
			triangle += i;
			numFactors = 0;
			if (EulerLibrary.isPerfectSquare(triangle)) {
				numFactors++;
			}
			for (int j = 1; j <= Math.sqrt(triangle); j++) {
				if ((triangle % j) == 0) {
					numFactors += 2;
				}
			}
		}
		this.solution = "" + triangle;
	}

}
