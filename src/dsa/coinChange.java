package dsa;
import java.util.Arrays;
public class coinChange {
    // bottom up approach 
    public static int Change(int[] coin, int money) {
	int [] dp = new int [money+1];
	Arrays.fill(dp, money + 1);
	dp[0]=0;
	for (int i=1; i<=money; i++) {
	    for(int j=0; j<coin.length;j++) {
		if(i-coin[j]>=0) {
		    dp[i]=Math.min(dp[i],1+dp[i-coin[j]]);
		}
	    }
	}
	if (dp[money] > money) {
	    return -1;
	} else {
	    return dp[money];
	}
    }
}
