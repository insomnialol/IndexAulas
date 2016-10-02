import static pt.ua.prog.WIO.*;
import java.io.*;
import java.util.Scanner;

// CRIAÇAO DE UM FICHEIRO PARA ESCRITA
// PrintWriter fluxoEsc = new PrintWriter (new FileWriter (nome));
// ABERTURA DE UM FICHEIRO PARA ESCRITA NO FIM DO FICHEIRO!!
// PrintWriter fluxoEsc = new PrintWriter (new FileWriter (nome, true));

public class EscreverFicheiros {
	public static void main(String[] args) throws IOException {
		String nomeFicheiro; // nome do ficheiro
		
		nomeFicheiro = readLine("Nome do ficheiro de entrada? "); // leitura do nome do ficheiro de entrada
		Scanner fluxoLer = new Scanner (new File(nomeFicheiro)); // abrir o ficheiro de entrada para leitura

		nomeFicheiro = readLine("Nome do ficheiro de saida? "); // leitura do nome do ficheiro de entrada
		FileWriter ficheiroEscrita = new FileWriter(nomeFicheiro); // criaçao do ficheiro de saida para escrita pt1
		PrintWriter fluxoEsc = new PrintWriter(ficheiroEscrita); // criaçao do ficheiro de saida para escrita pt2
		
		escreverFicheiro(fluxoLer, fluxoEsc); // processamento dos ficheiros
		
		fluxoLer.close(); // fecho dos ficheiros
		fluxoEsc.close();
	}

	public static void escreverFicheiro (Scanner pFL, PrintWriter pFE) {
		int n = 0; 
		int soma = 0; 
		double numero;
		
		while(pFL.hasNextDouble()) // existe algum double p ser lido?
		{
			numero = pFL.nextDouble(); // ler o numero do ficheiro de entrada
			if ( numero > 0 )
				pFE.printf("%f\n", numero); // escrever no ficheiro de saida
		}
	}
}




