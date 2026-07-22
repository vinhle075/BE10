package homework5;
public class removedupinsortedarray {
	 public static int removeDuplicates(int[] nums) {
	        int r=1;
	        for(int l=1;l<nums.length;l++){
	            if(nums[l]!=nums[l-1]){
	                nums[r]=nums[l];
	                r++;
	            }
	        }
	        return r ;
	    }
	 public static void main(String[] args) {
	        int[] a = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	        int newSize = removeDuplicates(a);

	        for (int i = 0; i < newSize; i++) {
	            System.out.print(a[i] + " ");
	        }
	    }
	}


