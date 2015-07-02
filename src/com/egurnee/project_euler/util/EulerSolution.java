package com.egurnee.project_euler.util;

public abstract class EulerSolution implements Solution, Runnable {
	protected String solution;

	@Override
	public final String getSolution() {
		return this.solution;
	}

}
