package homework5;
import java.util.Arrays;
public class removedupinsortedarray {
	 public static int[] removeDuplicates(int[] nums) {
	        if(nums.length==0) 
	        {
	        	return new int [0];
	        };
	        int r=1;
	        for(int l=1;l<nums.length;l++){
	            if(nums[l]!=nums[l-1]){
	                nums[r]=nums[l];
	                r++;
	            }
	        }
	        return Arrays.copyOf(nums, r) ;
	    }
	public static void main(String[] args) {
		int [] a=  {0,0,1,2,2,3,3,4};
		System.out.println(Arrays.toString(removeDuplicates(a))); 
		
	}

	}

