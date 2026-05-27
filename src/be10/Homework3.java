package be10;
public class Homework3 {
/*	public static int binaryGap(int n) {
		    n >>= Integer.numberOfTrailingZeros(n); 
		    if (n == 1) 
		    	return 0;                   

		    int gap = 0;
		    int maxGap = 0;
		    while (n > 0) {
		        if ((n & 1) == 1) {                 
		            maxGap = Math.max(maxGap, gap);
		            gap = 0;                        
		        } else
		            gap++;                          
		        n >>= 1;                            
		    }
		    return maxGap;
		}
	public static void main(String[] args) 
	{
		int d = binaryGap (32);
		System.out.println(d);
	}
}
*/
//	Sai
	public int solution(int[] A) {
	    long S = 0;

	    for (int i = 1; i < A.length - 1; i++) {
	        int prev    = A[i - 1];   //
	        int current = A[i];
	        int next    = A[i + 1];

	        // Skip số trùng liên tiếp
	        while (i < A.length - 1 && A[i] == A[i + 1]) {
	            i++;
	        }

	        if (i != A.length - 1) {
	            next = A[i + 1];
	        }

	        if (current > prev && current > next) {
	            S += current;   // đỉnh, cộng
	        } else if (current < prev && current < next) {
	            S -= current;   // đáy trừ
	        }
	    }

	    // Xử lý đầu, cuối
	    if (A[0] < A[1])                         
	    	S -= A[0]; // đáy đầu
	    if (A[0] > A[1])                         
	    	S += A[0]; // đỉnh đầu
	    if (A[A.length-1] > A[A.length-2])       
	    	S += A[A.length-1]; // đỉnh cuối
	    if (A[A.length-1] < A[A.length-2])       
	    	S -= A[A.length-1]; // đáy cuối

	    return (int) (S);
	}
}
	        