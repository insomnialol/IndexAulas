import java.util.Scanner;

public class ErrorHandlingScanner {
	public static void main(String[] args) {
		int a=0, b=0;
		boolean leituraOK = true;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Primeiro numero: :");
		
		if (teclado.hasNextInt()) // AQUI TESTAMOS SE EXISTE UM INT
			a = teclado.nextInt();
		else 
			leituraOK = false;
		
		if (leituraOK)
			System.out.println("Resultado = "+ (a+b));
		else
			System.out.println("Nao foi realizada a leitura dos numeros!");
	}
	
	/*  UTILIZAMOS O WHILE (ou DO WHILE) para construir processo repetitivo de introduçao de dados (utilizando o s para sair)
	int soma = 0;
	System.out.pritn("Sequencia de numeros inteiros (s para sair):");
	while (teclado.hasNextInt()) 
		soma = soma + teclado.nextInt();
	
	
	*/
	
}
