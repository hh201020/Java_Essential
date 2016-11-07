package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.olives.OliveJar;
import com.lynda.olivepress.olives.OliveName;

public class Main {

	public static void main(String[] args) throws Exception {

		OliveJar jar = new OliveJar();
		jar.addOlive(OliveName.KALAMATA, 0x000000);
		jar.addOlive(OliveName.PICHOLINE, 0x000000);
		jar.addOlive(OliveName.LIGURIO, 0x000000);
		jar.reportOlives();
	}
	
}