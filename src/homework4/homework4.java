package homework4;
import java.util.Arrays;
public class homework4 {
//	public static int solution(int[] A) {
//	    int size = A.length;
//	    int[] counters = new int[size];
////	    Đếm số lần xuất hiện của mỗi giá trị
//	    for (int a : A) {
//	        counters[a]++;
//	    }
//////	  Duyệt từ phải sang trái
//////    Giảm counter của A[i]
//////    Nếu counter về 0 → đây là lần xuất hiện cuối
////      → return i
//	    for (int i = size - 1; i >= 0; i--) {
//	        if (--counters[A[i]] == 0)
//	            return i;
//	    }
//	    return 0;
//	}
//	 public static void main(String[] args) {
//		 int [] A = {2, 2, 1, 0, 1};
//		 System.out.println(solution(A));
//	}
//}
	public static int solution(int[] A) {
		Arrays.sort(A);
////	duyệt từ i = 0 đến A.length
//      kiểm tra A[i] + A[i+1] > A[i+2]
//      đúng → return 1
		for (int i = 0; i <= A.length - 3; i++ ) {
			if(A[i] + A[i+1] > A[i+2] ) {
				return 1;
			}
		}
//		không tìm thấy -> 0
		return 0;
	}
	public static void main(String[] args) {
	    int[] A1 = {10, 2, 5, 1, 8, 20};
	    System.out.println(solution(A1));
	}
}
