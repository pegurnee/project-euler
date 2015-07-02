package com.egurnee.project_euler.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EulerFileReader {
	private final static String FILE_LOCATION = "assets/";

	public static int[][] getIntArraysFromFile(String filename)
			throws IOException {
		int[][] toReturn;

		final List<String> lines =
				Files.lines(Paths.get(FILE_LOCATION + filename)).collect(
					Collectors.toList());
		final Iterator<String> iterator = lines.iterator();
		final int limit = lines.size();

		toReturn = new int[limit][];
		for (int i = 0; i < limit; i++) {
			final String line = iterator.next();
			final String[] split = line.split(" ");

			int localLimit = split.length;
			toReturn[i] = new int[localLimit];
			for (int j = 0; j < localLimit; j++) {
				toReturn[i][j] = Integer.parseInt(split[j]);
			}
		}

		return toReturn;
	}

	public static Iterator<String> getStringArrayFromFile(String filename)
			throws IOException {
		return Files.lines(Paths.get(FILE_LOCATION + filename)).collect(
			Collectors.toList()).iterator();
	}
}
