package homework5;

public class movezeroes {
	    public static int moveZeroes(int[] nums) {
	        int left = 0;
	        for (int right = 0; right < nums.length; right++) {
	            if (nums[right] != 0) {
	                int temp = nums[right];
	                nums[right] = nums[left];
	                nums[left] = temp;
	                left++;
	            }
	        }
	        return left;
	    }
	    public static void main(String[] args) {
	        int[] a = {1, 2, 0, 4, 3, 0, 5, 0};
	        moveZeroes(a);
	        for (int num : a) {
	            System.out.print(num + " ");
	        }
	    }
	}
