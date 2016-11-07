package com.lynda.olivepress.olives;

public class Ligurian extends Olive {

	public Ligurian() {
		super(1);
		this.oliveName = "Lugurian";
		this.flavor = "Yummy";
		this.color = Olive.GREEN;
	}

	@Override
	public String getOrigin() {
		return "Italy";
	}
}
