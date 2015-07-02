package com.egurnee.project_euler.problems;

/**
 * Work for Project Euler Problem 13
 *
 * @author Eddie Gurnee
 * @version 0.0.1, 10/01/13
 *
 */
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Scanner;

import com.egurnee.project_euler.io.EulerFileReader;
import com.egurnee.project_euler.util.EulerSolution;

public class P013
extends EulerSolution {

	public static void main(String[] args) {
		Iterator<String> ostrS = null;

		try {
			ostrS = EulerFileReader.getStringArrayFromFile("013.eul");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("file not found");
			System.exit(-1);
		}

		BigInteger sum = new BigInteger(ostrS.next());
		for (; ostrS.hasNext();) {
			BigInteger addend = new BigInteger(ostrS.next());
			sum = sum.add(addend);
		}
		System.out.println(sum);
	}

	public static void readInInput() {
		Scanner kb = new Scanner(System.in);
		String str = "\"";
		System.out.println("Prompt");
		for (int i = 0; i < 100; i++) {
			str += kb.nextLine().trim() + " \" +\n\"";
		}
		System.out.println(str);
		kb.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
