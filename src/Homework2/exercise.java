package Homework2;
import java.util.Arrays;
import java.util.Scanner;
public class exercise {
		/*public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int []a = new int[size];
			System.out.println("Enter elements");
			for (int i = 0; i <size; i++) {
				a[i] = sc.nextInt();
			}
			int max = a[0];
			for (int i = 0; i < a.length; i++) {
				max = Math.max(max, a[i]);
			}
			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				min = Math.min(min, a[i]);
			}
			float avg,sum = 0;
			for (int i = 0; i<a.length; i++) {
				sum+=a[i];
			}
			avg = sum/a.length;
			System.out.println("Maxium Number="+max);
			System.out.println("Minimum Number="+min);
			System.out.println("Avg="+avg);
};}*/
	
/*public static boolean isPalindrome(int[]num) {
		int i = 0;
		int j = num.length-1;
		while (i<j) {
			if (num[i] !=num[j]){
				return false;
				}
		i++;
		j--;
		}
	return true;
}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array");
	int size = sc.nextInt();
	int[]a =new int [size];
	System.out.println("Enter elements");
	for (int i = 0; i <size; i++) {
	a[i] = sc.nextInt();
	}
    System.out.println(isPalindrome(a));
}
}*/
	
	
	/*public static boolean isPrimeNumber(int number)
	{
		if(number <=1) {
			return false;};
		for ( int i = 2 ; i < number;i++) {
		if (number % i == 0) 
		{ 
			return false;
		}
		}
		return true;
	};
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter number");
		int n = number.nextInt();
		if(isPrimeNumber(n)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
*/


	public static int singleNumber(int[]nums) {
		int n = nums.length;
		for(int i = 0; i < n -1; i +=2) {
			if (nums[1]!=nums[i+1]) {
				return nums[i];
			}
		}
		return nums[n-1];
	}
	 public static void main(String[] args) {
	        int[] a = {1, 1, 2, 2, 3, 4, 4};
	        System.out.println(singleNumber(a));
	    }
	}
