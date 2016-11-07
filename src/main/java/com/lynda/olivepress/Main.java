package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.olives.OliveJar;

public class Main {

	public static void main(String[] args) throws Exception {

		OliveJar jar = new OliveJar();
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.reportOlives();
	}
	
}