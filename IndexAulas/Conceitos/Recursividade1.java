
// https://www.hackerrank.com/challenges/30-recursion/tutorial

public class Recursividade1 {

	public static void main(String[] args) {
	    int result = nTimesK(4, 4);
	    System.out.println("Result: " + result);
	}

	
	private static int nTimesK(int n, int k) { // Multiply 'n' by 'k' using addition
	    System.out.println("n: " + n);
	   
	    if(n > 1) {  // Recursive Case
	        return k + nTimesK(n - 1, k);
	    }
	    
	    else { // Base Case n = 1
	        return k;
	    }
	}

}
