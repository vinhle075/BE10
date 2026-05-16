package be10;

/*public class BE9_Main {
	public static void main(String[] args) {
	double toan = 8;
	int ly = 7;
	int hoa = 8;
	
	double avg = (toan*2 + ly + hoa) / 4;
	
	System.out.print((toan*2 + ly));
	
	if (avg < 5) {
        System.out.println("Yếu");
    } 
	else if (avg >= 5 && avg <= 7) {
        System.out.println("Trung bình (TB)");
    } 
	else if (avg > 7 && avg < 8) {
        System.out.println("Khá");
    } 
	else {
        System.out.println("Giỏi");  
	}
}
}*/

import java.util.Scanner;
public class BE10_Main {
public static void main(String[] args) {
Scanner gradeScan = new Scanner(System.in);
System.out.println ("Enter Average Math, English, Literature");
//Numerical Input
double Mathematics = gradeScan.nextDouble();
double English = gradeScan.nextDouble();
double Literature = gradeScan.nextDouble();
double avg = (Mathematics + English + Literature)/3;
// Output
System.out.println("Math:" + Mathematics );
System.out.println("English:" + English);
System.out.println("Literature:" + Literature);
if (avg < 5) {
	System.out.println("F");
	}
else if (avg >=5) {
	System.out.println("D");
}
else if (avg >= 6) {
	System.out.println("C");
}
else if (avg >= 7) {
	System.out.println("B");
}
else if (avg >= 8) {
	System.out.println("A");
}
else if (avg >= 9 ) {
	System.out.println("S");
}
}
}

