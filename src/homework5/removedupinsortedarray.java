package homework5;

public class removedupinsortedarray {
	 public int removeDuplicates(int[] nums) {
	        if(nums.length==0) return 0;
	        int r=1;
	        for(int l=1;l<nums.length;l++){
	            if(nums[l]!=nums[l-1]){
	                nums[r]=nums[r];
	                r++;
	            }
	        }
	        return r;
	    }
	}

