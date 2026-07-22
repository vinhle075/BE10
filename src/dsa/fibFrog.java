package dsa;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
public class fibFrog {
// viet 1 array store fib num
/*    public static int solution(int[] A) {
	int N = A.length;
	List<Integer> fibs = new ArrayList<>();
	int a = 1, b = 2;
	while (a <= N + 1) {
	    fibs.add(a);
	    int next = a + b;
	    a = b;
	    b = next;
	}
	Queue<int[]> queue = new LinkedList<>();
	boolean[] visited = new boolean[N];
	queue.offer(new int[]{-1, 0});
	
	while (!queue.isEmpty()) {
	    int[] cur = queue.poll();     
	    int pos = cur[0];
	    int steps = cur[1];
	for (int fib : fibs) {
	        int next = pos + fib;
	        if (next == N) {
	            return steps + 1;
	        }
	        if (next >= 0 && next < N && A[next] == 1 && !visited[next]) {
	            visited[next] = true;
	            queue.offer(new int[]{next, steps + 1});
	        }
	}
    }
}
}*/

    
    
  //ArrayList
    package DSA_Homework;
    import java.util.ArrayDeque;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Queue;

    public class FrogJump {
    	
    	public static int solution(int[] A) {
    		

    	
    	//fibonacci
    	int[] fib =  new int[26];
    	fib[0] = 1;
    	fib[1] = 2;
    	int fibNums = 2; //bao nhieu so fibonacci 
    	while (fib[fibNums - 1] < A.length) {
    		fib[fibNums] = fib[fibNums-1] + fib[fibNums-2];
    		fibNums++;
    	
    		
    	}
    	
    	//setup
    	boolean[] visited = new boolean[A.length];
    	List<int[]> list = new ArrayList<>();
    	list.add(new int[] {-1,0}); 
    	
    	//logic
    	while (!list.isEmpty()) {
    		int[] current = list.remove(0);
    		
    		int frogPos = current[0];
    		int jumps = current[1];
    		
    		for (int i = 0; i < fibNums; i++) {
    			int frogPath = frogPos + fib[i];
    			
    			if (frogPath == A.length) {
    				return jumps + 1;
    				
    				
    			}
    			if (frogPath < A.length && A[frogPath] == 1 && !visited[frogPath]) { 
    				visited[frogPath] = true;
    				list.add(new int[] {frogPath, jumps + 1});
    			}
    		}
    		}
    	return -1;
    	}

    	public static void main(String[] args) {

    		int[] A = {1,1,0,0,1,0,0,1,0,0,0,0};
    		
    		
        
    		
    		System.out.println(solution(A));

    	}

    }

    /*import java.util.ArrayDeque;
    import java.util.Queue;
    
    public class FrogJump {
    	
    	public static int solution(int[] A) {
    		
    
    	
    	//fibonacci
    	int[] fib =  new int[26];
    	fib[0] = 1;
    	fib[1] = 2;
    	int fibNums = 2; //bao nhieu so fibonacci 
    	while (fib[fibNums - 1] < A.length) {
    		fib[fibNums] = fib[fibNums-1] + fib[fibNums-2];
    		fibNums++;
    	
    		
    	}
    	
    	//setup
    	boolean[] visited = new boolean[A.length];
    	Queue<int[]> queue = new ArrayDeque<>();
    	queue.add(new int[] {-1,0}); 
    	
    	//logic
    	while (!queue.isEmpty()) {
    		int[] current = queue.poll();
    		int frogPos = current[0];
    		int jumps = current[1];
    		
    		for (int i = 0; i < fibNums; i++) {
    			int frogPath = frogPos + fib[i];
    			
    			if (frogPath == A.length) {
    				return jumps + 1;
    				
    				
    			}
    			if (frogPath < A.length && A[frogPath] == 1 && !visited[frogPath]) { 
    				visited[frogPath] = true;
    				queue.add(new int[] {frogPath, jumps + 1});
    			}
    		}
    		}
    	return -1;
    	}
    
    	public static void main(String[] args) {
    
    		int[] A = {1,1,0,0,1,0,0,1,0,0};
    		
    		
        
    		
    		System.out.println(solution(A));
    
    	}
    
    }*/