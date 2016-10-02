import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Condicionais {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String resposta ="";


		n ? System.out.println("Par") : System.out.println("Impar"); 
		
		if(n%2==1) { // n é IMPAR
			resposta = "n Impar"; 
		}
		else { // sendo n PAR
			if(n>=3 && n<=5) { resposta = "n Par entre 3 e 5"; }
			if(n>=6 && n<=20) { resposta = "n Par entre 6 e 20"; }
			if(n>20) { resposta = "n Par maior que 20"; }
		}
		
		System.out.println(resposta);
		
		// diferença do do { ... } while(condicao); e do while(condicao) { ... } é que o do .. while executa sempre pelo menos 1 vez
	}
}
