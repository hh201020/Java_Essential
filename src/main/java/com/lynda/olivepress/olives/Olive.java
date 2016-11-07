package com.lynda.olivepress.olives;
public abstract class Olive {
	
	public static final long BLACK = 0x000000;
	public static final long GREEN = 0x00FF00;
	
	public String oliveName = "Kalamata";
	public String flavor = "Grassy";
	public long color = Olive.BLACK;
	private int oil = 3;
	
	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public Olive() {
		System.out.println("Constructor of " + this.oliveName);
	}
	
	public Olive(String oliveName) {
		this.oliveName = oliveName;
	}
	
	public Olive(String oliveName, long color) {
		this(oliveName);
		this.color = color;
	}
	
	public String toString() {
		return "name: " + this.oliveName + ": " + "color: " +  this.color;
	}
	
	public Olive(int oil) {
		setOil(oil);
	}

	public int crush() {
		System.out.println("Crush from super class!");
		return oil;
	}

	public abstract String getOrigin();
}
