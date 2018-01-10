package TP1;

public class ExprArith {
	public static void main(String[] args) {
		System.out.println("4 / 3 = " + 4/3);
		System.out.println("4 / 3.0 = " + 4/3.0);
		System.out.println("4 - 3 * 5 = " + (4 - 3 * 5));
		System.out.println("4 - (3 * 5) = " + (4 - (3 * 5)));
		System.out.println("(4 - 3) * 5 = " + ((4 - 3) * 5));
		System.out.println("117 % 7 = " + 117 % 7);
		System.out.println("0.3 - 0.2 = " + (0.3 - 0.2));
		System.out.println("0.2 - 0.1 = " + (0.2 - 0.1));
		System.out.println("1.3 / 0 = " + 1.3/0);
		System.out.println("(-1.3) / 0 = " + (-1.3)/0);
		System.out.println("0/1.3 = " + 0/1.3);
		//Il sortira une érreur
		//System.out.println("0 / 0 = " + 0/0);

	// Conseil
	// Il falalit mettre entre parenthèses les expressions avec un signe (-)
	}
}
