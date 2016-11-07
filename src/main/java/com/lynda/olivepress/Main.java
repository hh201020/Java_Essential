package com.lynda.olivepress;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Kalamata;
import com.lynda.olivepress.olives.Ligurian;
import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.OliveJar;
import com.lynda.olivepress.press.OlivePress;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Olive> oliveStatic = OliveJar.olives;
		for (Olive o:oliveStatic) {
			System.out.println("It's a " + o.oliveName
					+ " olive!");
		}
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		
		Olive olive;
		
		olive = new Kalamata();
		olives.add(olive);

		olive = new Ligurian();
		olives.add(olive);

		olive = new Kalamata();
		olives.add(olive);
	
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");
		
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + 
				" units of oil");
		
		Olive olive1 = olives.get(0);
		System.out.println("Olive 1 is from: " + olive1.getOrigin());
		
		Olive olive2 = olives.get(1);
		System.out.println("Olive 2 is from: " + olive2.getOrigin());	
		
		Olive olive3 = new Olive() {
			
			@Override
			public String getOrigin() {
				return "Nowhere";
			}
		};
		System.out.println("Olive 3 is from: " + olive3.getOrigin());	

	}

}
