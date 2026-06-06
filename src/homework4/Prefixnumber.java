package homework4;
import java.util.Arrays;
public class Prefixnumber {
	public static int solution(int[] A) {
	    int size = A.length;
	    int[] counters = new int[size];
//	    Đếm số lần xuất hiện của mỗi giá trị
	    for (int a : A) {
	        counters[a]++;
	    }
////	  Duyệt từ phải sang trái
////    Giảm counter của A[i]
////    Nếu counter về 0 → đây là lần xuất hiện cuối
//      → return i
	    for (int i = size - 1; i >= 0; i--) {
	        if (--counters[A[i]] == 0)
	            return i;
	    }
	    return 0;
	}
	 public static void main(String[] args) {
		 int [] A = {2, 2, 1, 0, 1};
		 System.out.println(solution(A));
	}
}

