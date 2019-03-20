package pixie;
import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		System.out
				.println("What would you like to do? \n+1 - add \n+2 - substract \n+3 - multiply \n+4 - devide");
		System.out.print("Your input:");
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		boolean cont = true;
		while (cont == true) {
			repeat(cont, op);
			// op = sc.next();
			/*
			 * boolean repeat = true; while (repeat == true) { try {
			 * Integer.parseInt(op); repeat = false; } catch
			 * (NumberFormatException e) {
			 * System.out.println("Invalid input \nReselect your input:");
			 * repeat = true; op = sc.next(); }
			 */
			if (Integer.parseInt(op) <= 0 || Integer.parseInt(op) > 4) {
				System.out.println("invalid method");
			} else
				CalculatorMain(Integer.parseInt(op));

			System.out.println("Want to continue? 1.Yes 2.No");
			int myCon = sc.nextInt();
			switch (myCon) {
			case 1:
				cont = true;
				System.out.println("What would you like to do? \n+1 - add \n+2 - substract \n+3 - multiply \n+4 - devide");
				System.out.print("Your input:");
				op = sc.next();
				break;

			case 2:
				cont = false;

			default:
				break;
			}

		}
	}

	// sc.close();

	public static void repeat(boolean re, String op) {
		Scanner sc = new Scanner(System.in);
		while (re == true) {
			try {
				Integer.parseInt(op);
				re = false;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input \nReselect your input:");

				re = true;
			}
		}
	}

	public static void CalculatorMain(int op) {
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please provide X:");
		int x = sc.nextInt();
		System.out.print("Please provide Y:");
		int y = sc.nextInt();
		CalResult myResult = null;
		switch (op) {
		case 1:
			myResult = calc.add(x, y);
			if (myResult.getErrCode() == 0) {
				System.out.println("Result: " + myResult.getResult());
			} else
				System.out.println("Error: " + myResult.getMessage());
			break;

		case 2:
			myResult = calc.sub(x, y);
			if (myResult.getErrCode() == 0) {
				System.out.println("Result: " + myResult.getResult());
			} else
				System.out.println("Error: " + myResult.getMessage());
			break;

		case 3:
			myResult = calc.mul(x, y);
			if (myResult.getErrCode() == 0) {
				System.out.println("Result: " + myResult.getResult());
			} else
				System.out.println("Error: " + myResult.getMessage());
			break;

		case 4:
			myResult = calc.devide(x, y);
			if (myResult.getErrCode() == 0) {
				System.out.println("Result: " + myResult.getResult());
			} else
				System.out.println("Error: " + myResult.getMessage());
			break;

		}
		// sc.close();
	}
}