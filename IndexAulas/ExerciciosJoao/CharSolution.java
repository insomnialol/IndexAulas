package AulasJoao;
import java.util.*;

//DAY 6: https://www.hackerrank.com/challenges/30-review-loop
// exemplo do s.charAt(x)

public class CharSolution {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String s;

		for(int i=0;i<T;i++){
			s = scan.next();

			for(int j=0;j<s.length();j++){

				if(j%2 ==0){
					System.out.print(s.charAt(j));
				}
			} 
			System.out.print(" ");
			for(int j=0;j<s.length();j++){
				if(j%2 == 1){
					System.out.print(s.charAt(j));
				}

			}
			System.out.println();
		}

	}
}