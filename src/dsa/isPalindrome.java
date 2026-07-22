package dsa;
import java.util.Scanner;
public class isPalindrome {
	
public static boolean solution(int[]nums) {
		int left = 0;
		int right = nums.length-1;
		while (left<right) {
			if (nums[left] !=nums[right]){
			    System.out.println("Array is not a palindrome");
				return false;
				}
		left++;
		right--;
		}
		System.out.println("Array is a palindrome");
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
	sc.close();
System.out.println(solution(a));
}
}

