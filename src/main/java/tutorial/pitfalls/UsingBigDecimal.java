package tutorial.pitfalls;

import java.math.BigDecimal;

public class UsingBigDecimal {

	// Calculation and rounding need BigDecimal
	public static void main(String[] args) {
		// Not guaranteed precision in this way
		BigDecimal payment = new BigDecimal(1115.37);
		System.out.println(payment.toString());
		
		// For best numeric precision, create BigDecimal object from a String
		double d = 1115.37;
		String ds = Double.toString(d);
		BigDecimal bd = new BigDecimal(ds);
		System.out.println(bd.toString());

	}
}
