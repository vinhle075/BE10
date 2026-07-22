package dsa;
public class primeNumber {
    public static boolean isPrimeNumber(int number) {
	if(number == 1|| number == 2) {
	    return true;
	}
	if (number<=1|| number % 2 ==0) {
	    return false;
	}
	int sqrtNumber = (int)Math.sqrt(number);
	int checkNumber = 3;
	while(checkNumber<=sqrtNumber) {
	    if ( number % checkNumber == 0) {
		return false;
		}
		checkNumber +=2;
	}
	    return true;
	}
	public static void main(String[] args) {
	    int num = 121;
	    boolean isCorrect = isPrimeNumber(num);
	    System.out.println("isPrimeNumber:"+ isCorrect);
	}
}