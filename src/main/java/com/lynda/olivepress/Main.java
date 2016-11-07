package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Olive> oliveStatic = new OliveJar(10, "Kalamata", 0x000000).olives;

		for (Olive o:oliveStatic) {
			System.out.println("It's a " + o.oliveName
					+ " olive!");
		}
		
	}

}
