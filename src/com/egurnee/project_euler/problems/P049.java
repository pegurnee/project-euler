package com.egurnee.project_euler.problems;

import com.egurnee.project_euler.util.EulerLibrary;
import com.egurnee.project_euler.util.EulerSolution;

/**
 * Work for Project Euler Problem 20
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/02/13
 *
 */
public class P049 extends EulerSolution {

	public static void main(String[] args) {
		String formula = "";

		for (int x = 1001; x < 3339; x += 2) {
			if (EulerLibrary.isPrime(x)) {
				int y = x + 3330;
				if (EulerLibrary.isPrime(y)) {
					int z = y + 3330;
					if (EulerLibrary.isPrime(z)) {

					}
				}
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
