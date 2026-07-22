package dsa;

import java.util.ArrayList;
import java.util.List;

public class binaryGap {
    public static int solution(int n) {
 	String binaryStr = Integer.toBinaryString(n);
 	String[] chars = binaryStr.split("");
 	List<Integer> indexes = new ArrayList<>();
 	
 	for (int i = 0; i < chars.length;i++){
 	    if (chars[i].equals("1")) {
 		indexes.add(i);
 	    }
 	}
 	int result = 0;
 	if (indexes.size()==chars.length||indexes.size()==1) {
 	    return result;
 	}
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

    public static void main(String[] args) {
	int d = solution(32);
	System.out.println(d);
    }
}
	
//	Sai
	      