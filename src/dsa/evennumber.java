package homework4;

public class evennumber {
    public static int solution(int[] nums) {
	int count = 0;
	for (int left = 0; left < nums.length; left++) {
	    for(int right=left+1; right<nums.length;right++) {
	    if ((nums[left] + nums[right]) % 2 == 0) {
		count++;
	    }
	}
}
	return count;
    }

public static void main(String[] args) {
    int[] a = { 2, 1, 5, -6, 9 };
    System.out.println(solution(a));
}
}
