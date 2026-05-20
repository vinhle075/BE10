/*
 * package be10;
 * 
 * public class BE9_Main { public static void main(String[] args) { double toan
 * = 8; int ly = 7; int hoa = 8;
 * 
 * double avg = (toan*2 + ly + hoa) / 4;
 * 
 * System.out.print((toan*2 + ly));
 * 
 * if (avg < 5) { System.out.println("Yếu"); } else if (avg >= 5 && avg <= 7) {
 * System.out.println("Trung bình (TB)"); } else if (avg > 7 && avg < 8) {
 * System.out.println("Khá"); } else { System.out.println("Giỏi"); } } }
 * 
 * import java.util.Scanner; public class BE10_Main { public static void
 * main(String[] args) { Scanner gradeScan = new Scanner(System.in);
 * System.out.println ("Enter Average Math, English, Literature"); //Numerical
 * Input double Mathematics = gradeScan.nextDouble(); double English =
 * gradeScan.nextDouble(); double Literature = gradeScan.nextDouble(); double
 * avg = (Mathematics + English + Literature)/3; double grades[]= {Mathematics,
 * English, Literature}; getrank(grades); if((Mathematics < 5)||(English
 * <5)||(Literature <5)) { System.out.println("FAIL"); }; // Output
 * System.out.println("Math:" + Mathematics ); System.out.println("English:" +
 * English); System.out.println("Literature:" + Literature); if (avg < 5) {
 * System.out.println("F"); } else if (avg >=5) { System.out.println("D"); }
 * else if (avg >= 6) { System.out.println("C"); } else if (avg >= 7) {
 * System.out.println("B"); } else if (avg >= 8) { System.out.println("A"); }
 * else if (avg >= 9 ) { System.out.println("S"); } } }
 */
package be10;

import java.math.BigDecimal;
import java.util.Scanner;

public class Be10Main {

	static void doSomething() {
		System.out.println("This is my function");
		System.out.println("This is my function 2nd line");
	}

	static void doSomething(double score, String subject) {
		if (score >= 9) {
			System.out.println(subject + ": Grade S ");
		} else if (score >= 😎 {
			System.out.println(subject + ": Grade A ");
		} else if (score >= 7) {
			System.out.println(subject + ": Grade B ");
		} else if (score >= 6) {
			System.out.println(subject + ": Grade C ");
		} else if (score >= 5) {
			System.out.println(subject + ": Grade D ");
		} else {
			System.out.println(subject + ": Grade F ");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Average point of Mathematics: ");
		double math = scanner.nextDouble(); // 8

		System.out.print("Enter Average point of English: ");
		double english = scanner.nextDouble(); // 7

		System.out.print("Enter Average point of Literature: ");
		double literature = scanner.nextDouble(); // 6

		// Math
		doSomething(math, "Math"); // doSomething(😎 // PASS BY VALUE
		doSomething(english, "English"); // doSomething(7) // PASS BY VALUE
		doSomething(literature, "Lit"); // doSomething(6) // PASS BY VALUE

		// average of 3 subjects
		int averageScore = (int) ((math + english + literature) / 3); // 8.4444
		System.out.printf("Average of all subjects: %.2f\n", ((math + english + literature) / 3));

		int lowestScore = (int) (Math.min(math, Math.min(english, literature)));

		// NEW LOGIC
		if (lowestScore < 5) {
			averageScore = lowestScore;
		} else if (averageScore > lowestScore) {
			averageScore = lowestScore + 1;
		}

		switch (averageScore) {
		case 10:
		case 9:
			System.out.println("Grade S - Excellent Student");
			break;
		case 8:
			System.out.println("Grade A - good Student");
			break;
		case 7:
			System.out.println("Grade B - normal Student");
			break;
		case 6:
			System.out.println("Grade C - average Student");
			break;
		case 5:
			System.out.println("Grade D - not bad student");
			break;
		default:
			System.out.println("Grade F - Fail Student");
		}

	}

}