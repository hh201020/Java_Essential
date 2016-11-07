package com.lynda.olivepress.olives;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.oliveName = "Kalamata";
		this.flavor = "Grassy";
		this.color = Olive.BLACK;
	}
	
	@Override
	public int crush() {
		System.out.println("Crush from subclass.");
		return super.crush();
	}

	@Override
	public String getOrigin() {
		return "Greece";
	}

}
