package com.egurnee.project_euler.util;

public abstract class EulerSolution implements Solution, Runnable {
	protected String solution;

	@Override
	public final String getSolution() {
		if (this.solution == null) {
			this.run();
		}
		return this.solution;
	}

}
