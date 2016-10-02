import java.io.*;

public class ErrorHandlingTryCatch {

	public static void main (String[] args) {
		int a, b, resultado; 
		String str1 = "", str2 = "";
		
		BufferedReader kB = new BufferedReader (new InputStreamReader (System.in)); // DISPOSITIVO DE ENTRADA: TECLADO
	
	try {
		System.out.print("Introduza o primeiro numero:");
		str1 = kB.readLine();
		System.out.print("Introduza o segundo numero:");
		str2 = kB.readLine();
	}
	catch (IOException meuErro) {
		System.out.println("Erro de IO ao tentar ler as entradas!");
		System.exit(1);
	}		
	
	a = Integer.parseInt(str1); // conversao para Inteiro
	b = Integer.parseInt(str2);
	
	System.out.println("Resultado = " + (a+b));
	}
}
