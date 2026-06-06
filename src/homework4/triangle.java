package homework4;

import java.util.Arrays;

public class triangle {
	public static int solution(int[] A) {
		Arrays.sort(A);
		for (int i = 0; i <= A.length - 3; i++ ) {
			if(A[i] + A[i+1] > A[i+2] ) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
	    int[] A1 = {10, 2, 5, 1, 8, 20};
	    System.out.println(solution(A1));
	}
}

