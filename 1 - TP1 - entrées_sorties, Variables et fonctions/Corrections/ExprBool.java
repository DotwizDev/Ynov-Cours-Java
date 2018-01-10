package TP1;

public class ExprBool {

	public static void main(String[] args) {
		System.out.println("10 > 5 = " + (10 > 5));
		System.out.println("10 == 5 = " + (10 == 5));
		System.out.println("5 == 5 = " + (5 == 5));
		System.out.println("5 == 11 - 6 = " + (5 == 11 - 6));
		System.out.println("false || (5 != 4) = " + (false || (5 != 4)));
		System.out.println("false && (5 != 4) = " + (false && (5 != 4)));
		System.out.println("!(30 % 3 == 0) = " + !(30 % 3 == 0));
		System.out.println("0.3 - 0.2 == 0.2 - 0.1 = " + (0.3 - 0.2 == 0.2 - 0.1));
	}
}
