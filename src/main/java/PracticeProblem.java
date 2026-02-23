	/**
		* File: Lesson 1.6 - Booleans
		* Author: Leo
		* Date Created: February 20, 2026
		* Date Last Modified: February 20, 2026
		*/
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		boolean bool = input.nextBoolean();
		System.out.println(bool);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int int1 = input.nextInt();
		System.out.println(int1 > 5);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input pizza: ");
		String word = input.nextLine();
		System.out.println(word.equals("pizza"));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = input.nextDouble();
		System.out.println(num == 0);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num = input.nextInt();
		System.out.println(num != 0);
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word earlier than google: ");
		String word = input.nextLine();
		System.out.println(word.compareTo("google") < 0);
	}

}
