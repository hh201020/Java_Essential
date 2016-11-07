package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public static ArrayList<Olive> olives;
	
	static {
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0x000000) {
			@Override
			public String getOrigin() {
				return null;
			}
		});
		olives.add(new Olive("Picholine", 0x00FF00) {
			@Override
			public String getOrigin() {
				return null;
			}
		});
		olives.add(new Olive("Kalamata", 0x000000) {
			@Override
			public String getOrigin() {
				return null;
			}
		});
	}

}
