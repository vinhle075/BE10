package dsa;

public class smsMessages {
public static int solution(String S, int K) {
    String[] words = S.split(" "); // tach cau bang" ", nhet vo array String
    for (String w: words) {
	    if(w.length()>K) {
		return -1;
	    }
    }
    int count = 0;
    int currentLen =0;
    for (int i = 0; i < words.length; i++) {
	String w = words[i];
	if (currentLen == 0) {
	    currentLen += w.length();
	    count++;
	} else if(currentLen+1+w.length()<=K) {
	    currentLen+= 1+w.length();
	}
	else {
	    currentLen = w.length();
	    count++;
	}
    }
    return count;
}
public static void main(String[] args) {
    System.out.println(solution("SMS messages are really short", 12)); // 3
    System.out.println(solution("a b c d e", 3));                       // 3
    System.out.println(solution("aaa bbb", 3));                         // 2
    System.out.println(solution("ab cd ef", 2));                        // 3
    System.out.println(solution("hello", 5));                           // 1
    System.out.println(solution("hello", 4));                           // -1
    System.out.println(solution("one two three four", 20));             // 1
    System.out.println(solution("a a a a a a", 1));                     // 6
}
}
