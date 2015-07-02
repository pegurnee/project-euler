package com.egurnee.project_euler.problems;

/**
 * Work for Project Euler Problem 11
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
import java.io.IOException;

import com.egurnee.project_euler.io.EulerFileReader;
import com.egurnee.project_euler.util.EulerSolution;

public class P011
	extends EulerSolution {

	public static void main(String[] args) {
		System.out.println(toArray(20));
	}

	public static long toArray(int gridSize) {
		int[][] theArray = null;

		try {
			theArray = EulerFileReader.getIntArraysFromFile("011.eul");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("file not found");
			System.exit(-1);
		}

		long solution = 0;
		// checks every single column
		for (int row = 0; row < (gridSize - 4); row++) {
			for (int col = 0; col < gridSize; col++) {
				long tempSol = theArray[col][row];
				for (int x = 1; x < 4; x++) {
					tempSol *= theArray[col][row + x];
				}
				if (tempSol > solution) {
					solution = tempSol;
				}
			}
		}
		// checks every single row
		for (int row = 0; row < gridSize; row++) {
			for (int col = 0; col < (gridSize - 4); col++) {
				long tempSol = theArray[col][row];
				for (int x = 1; x < 4; x++) {
					tempSol *= theArray[col + x][row];
				}
				if (tempSol > solution) {
					solution = tempSol;
				}
			}
		}

		// checks diagonal '\'
		for (int row = 0; row < (gridSize - 4); row++) {
			for (int col = 0; col < (gridSize - 4); col++) {
				long tempSol = theArray[col][row];
				for (int x = 1; x < 4; x++) {
					tempSol *= theArray[col + x][row + x];
				}
				if (tempSol > solution) {
					solution = tempSol;
				}
			}
		}
		// checks diagonal '/'
		for (int row = 0; row < (gridSize - 4); row++) {
			for (int col = gridSize - 1; col > 2; col--) {
				long tempSol = theArray[col][row];
				for (int x = 1; x < 4; x++) {
					tempSol *= theArray[col - x][row + x];
				}
				if (tempSol > solution) {
					solution = tempSol;
				}
			}
		}
		return solution;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.solution = "" + toArray(20);
	}
}
