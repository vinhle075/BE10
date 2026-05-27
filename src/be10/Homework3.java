package be10;
public class Homework3 {
	public static int binaryGap(int n) {
		    n >>= Integer.numberOfTrailingZeros(n); //remove trailing zeros
		    if (n == 1) 
		    	return 0;                   //n is a power of two

		    int gap = 0;
		    int maxGap = 0;
		    while (n > 0) {
		        if ((n & 1) == 1) {                 //found set bit
		            maxGap = Math.max(maxGap, gap);
		            gap = 0;                        //reset gap
		        } else
		            gap++;                          //increase gap
		        n >>= 1;                            //advance to next bit
		    }
		    return maxGap;
		}
	public static void main(String[] args) 
	{
		int d = binaryGap (32);
		System.out.println(d);
	}
}