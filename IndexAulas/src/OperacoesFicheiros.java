/* FUNÇOES PARA OPERAR SOBRE FICHEIROS
public static void delete();
public static boolean canRead();
public static boolean canWrite();
public static boolean exists();
public static boolean isFile();
public static boolean isDirectory();
public static long length();
public static void renameTo(novonome);
public static void setReadOnly(); // coloca o ficheiro com permissao para leitura apenas
*/

import java.io.*;

public class OperacoesFicheiros {
	public static void main (String[] args) throws IOException {
		File ficheiro;
		int car; // caracter lido do ficheiro de entrada
		
		if (args.length < 2) { // o numero de argumentos é suficiente? 
			System.out.printf("Uso: java OperacoesFicheiros ficheiro ficheiro\n");
			System.exit(1);
		}
		
		// verificar a existencia do ficheiro cujo nome é args[0]
		ficheiro = new File (args[0]);
		if(!ficheiro.exists()) {
			System.out.printf("O ficheiro %s nao existe \n", args[0]);
			System.exit(1);
		}
		
		// abrir o ficheiro cujo nome é args[0] para LEITURA
		FileReader ficheiroLeitura = new FileReader (args[0]);
		BufferedReader fluxoLer = new BufferedReader (ficheiroLeitura);
		
		// verificar a nao existencia do ficheiro cujo nome é args[1]
		ficheiro = new File (args[1]);
		if(ficheiro.exists()) {
			System.out.printf("O ficheiro %s já existe\n", args[1]);
			System.exit(1);
		}
		
		// criar o ficheiro cujo nome é args[1] para escrita
		FileWriter ficheiroEscrita = new FileWriter (args[1]);
		PrintWriter fluxoEsc = new PrintWriter (ficheiroEscrita);
		
		// processamento dos ficheiros
		while ( (car = fluxoLer.read()) != - 1)
			fluxoEsc.printf("%c", Character.toLowerCase(car));
		
		// fecho do ficheiro de entrada e de saida
		fluxoLer.close();
		fluxoEsc.close();
	}
}
