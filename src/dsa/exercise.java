package dsa;
import java.util.Arrays;
public class exercise {
/*public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int []a = new int[size];
			System.out.println("Enter elements");
			for (int i = 0; i <size; i++) {
				a[i] = sc.nextInt();
			}
			int max = a[0];
			for (int i = 0; i < a.length; i++) {
				max = Math.max(max, a[i]);
			}
			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				min = Math.min(min, a[i]);
			}
			float avg,sum = 0;
			for (int i = 0; i<a.length; i++) {
				sum+=a[i];
			}
			avg = sum/a.length;
			System.out.println("Maxium Number="+max);
			System.out.println("Minimum Number="+min);
			System.out.println("Avg="+avg);
};}*/
public static void main1(String[] args ) {
    int[] nums = {3,4,5};
    if (nums.length==0) {
	return; //END //TERMINATE
    }
	int maxVal = nums[0];
	int minVal= nums[0];
	int total = 0;
	//for each loop each item in array
	for (int num:nums) {
	    if ( num>maxVal)
	    {
		maxVal= num;
	    }
	    if( num<minVal) 
	    {
		minVal=num;
	    }
	    total += num;
	}
    double avg = (double)total/nums.length;
    System.out.println("Max:" + maxVal );
    System.out.println("Min:" + minVal);
    System.out.printf("Average: %.2f\n", avg);
}


public static int singleNumber(int[] nums) {
			Arrays.sort(nums);
			for(int i = 1; i < nums.length; i +=2) {
				if (nums[i-1]!=nums[i]) {
					return nums[i-1];
				}
			}
			return nums[nums.length-1];
		} 
		 public static void main(String[] args) {
		        int[] a = {3, 2, 4, 2, 3};
	            int d = singleNumber(a);
		        System.out.println(d);
		    }
	} 
