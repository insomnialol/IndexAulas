import java.util.Scanner;
import java.io.*;
import static pt.ua.prog.WIO.*;

// FICHEIROS
// CALCULO DA MEDIA DE UM FICHEIRO DE NUMEROS

	// alguma teoria de ficheiros.... 
	// abertura de um ficheiro para leitura (classe BufferedReader)
	// BufferedReader fluxoLer = new BufferedReader (new FileReader (nome));
	// mais facil com a classe Scanner
	// Scanner fluxoLer = new Scanner (new File (nome));

public class LerFicheiros {
		
	public static void main (String[] args) throws IOException {
		String nomeFicheiro; 
		double media;
		
		nomeFicheiro = readLine ("Nome do ficheiro? "); // leitura do nome do ficheiro
		Scanner fluxoLer = new Scanner (new File (nomeFicheiro)); // abrir o ficheiro para leitura
		media = mediaFicheiro(fluxoLer); 
		printf("Média dos numeros lidos do ficheiro = %f\n", media);
		fluxoLer.close(); // fecho do ficheiro
		
	}
	// calculo da media de um ficheiro de texto de numeros reais (classe Scanner)
	public static double mediaFicheiro (Scanner pFL) {
		int n = 0, soma = 0; double numero; 
		while (pFL.hasNextDouble()) // existe algum double..
		{
			numero = pFL.nextDouble(); // ler o numero real (double)
			n++; // incrementa o num de numeros lidos
			soma += numero;  // acumular o num lido à soma
		}
		if (n!=0) return soma/n; // se foram lidos numeros, entao, calcular e devolver a media
		else return 0.0; // se nao forma lidos numeros, devolve 0.0
	}
	
}

