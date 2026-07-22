package dsa;
public class deepestPit {

    public static void main(String[] args) {
	int[] AA = { -11, 4, 3, 1, -2, 1, -18 };
	System.out.println("DeepestPit:" + DeepestPit(AA));
    }

    public static int DeepestPit(int[] A) {
	int dP = 0;
	int d1 = 0;
	int d2 = 0;
	int dPt = 0;
	for (int i = 1; (i < A.length - 1); i++) {
	    if ((A[i] < A[i + 1]) && (A[i] < A[i - 1])) { // i is the bottom of a pit
		System.out.println("pit=" + i);
		d1 = d2 = 0;
		for (int j = i; (j > 0); j--)
		    if (A[j - 1] > A[j])
			d1 += (A[j - 1] - A[j]);
		    else
			break; // left arm
		for (int j = i; (j < A.length - 1); j++)
		    if (A[j] < A[j + 1])
			d2 += (A[j + 1] - A[j]);
		    else
			break; // rigth arm
		if (d1 < d2)
		    dPt = d1;
		else
		    dPt = d2;
		if (dP < dPt)
		    dP = dPt;
	    }
	}
	if (dP != 0)
	    return dP;
	else
	    return -1;
    }
}
   
