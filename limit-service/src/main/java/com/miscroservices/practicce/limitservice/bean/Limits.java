package com.miscroservices.practicce.limitservice.bean;

public class Limits {
	private int minimum;
	private int maximin;
	
	
	public Limits() {
		super();
	}
	public Limits(int minimum, int maximin) {
		super();
		this.minimum = minimum;
		this.maximin = maximin;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximin() {
		return maximin;
	}
	public void setMaximin(int maximin) {
		this.maximin = maximin;
	}
	
	
	
	
}
