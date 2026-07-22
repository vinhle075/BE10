package dsa;
import java.util.HashMap;
import java.util.Map;
public class dominator {
public int solution(int[]A){
    // Using "hashMap" for counting
    Map<Integer, Integer> map = new HashMap<>();

    // 1. Counting
    // map(key, value) ---> map(number, count)
    for (int i = 0; i < A.length; i++) {
	if (!map.containsKey(A[i])) { // new number
	    map.put(A[i], 1); // "put" new number
	} else {
	    int count = map.get(A[i]); // "get" count
	    map.put(A[i], count + 1); // count++
	}
    }

    // 2. find the max number of counts
    int max_Number = 0;
    int max_Count = 0;
    // note: use "map.keySet()" in for loop
    for (int key : map.keySet()) {
	int cur_Count = map.get(key); // get value
	if (cur_Count > max_Count) {
	    max_Count = cur_Count; // update max count
	    max_Number = key;
	}
    }

   
    if (max_Count > (A.length) / 2) {
    } else {
	return -1;
    }

    for (int i = 0; i < A.length; i++) {
	if (A[i] == max_Number) {
	    return i; 
	}
    }

    return -1;
}
}