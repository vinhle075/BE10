package dsa;

public class theFeast {
    public static int solution(int n, int c, int m) {
	int total = n/c;
	int wrappers = total;
	while(wrappers>=m) {
		total += wrappers/m;
		wrappers = wrappers/m + wrappers % m;
	    }
	    return total;
	};
public static void main(String[] args) {
    System.out.println(solution(10, 2, 5)); 
    System.out.println(solution(12, 4, 4)); 
    System.out.println(solution(6, 2, 2));  
    System.out.println(solution(15, 3, 2)); 
}
}