import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Classe de teste do projecto 1 referente ah TUTEDECC.
 * @author Team LabP
 */
public class RunSemana1 {

	public static void main (String[] args) throws IOException {

		BufferedReader in;
		BufferedReader letras;
		BufferedWriter out;

		// testar shift
		in = new BufferedReader( new FileReader("F:\\eclipse workspace\\Executaveis\\Texto.txt"));
		letras = new BufferedReader(new FileReader("F:\\eclipse workspace\\Executaveis\\Letras.txt"));
		out = new BufferedWriter( new FileWriter("F:\\eclipse workspace\\Executaveis\\TOPorRetirarLetras.txt") );

		TUTEDECC.retiraLetras(in, letras, out);

		in.close();
		out.close();
		letras.close();

		// testar troca de letras
		in     = new BufferedReader( new FileReader("F:\\eclipse workspace\\Executaveis\\Texto.txt"));
		out    = new BufferedWriter( new FileWriter("F:\\eclipse workspace\\Executaveis\\TOPorLetrasPorNumeros.txt") );

		TUTEDECC.letrasPorNumeros(in,out);

		in.close();
		out.close();
		/*
		// testar rotacao
		in     = new BufferedReader( new FileReader(args[0]));
		out    = new BufferedWriter( new FileWriter("TOPorRotacao.txt") );

		TUTEDECC.rotacao(in, out, 6);

		in.close();
		out.close();


		//testar ocorencias
		in     = new BufferedReader( new FileReader(args[0]));
		out    = new BufferedWriter( new FileWriter("FrequenciaDeLetras.txt") );

		TUTEDECC.frequenciasLetras(in,out);

		in.close();
		out.close();

		
		in     = new BufferedReader( new FileReader(args[0]));
		BufferedReader padroes = new BufferedReader(new FileReader(args[2]));
		out    = new BufferedWriter( new FileWriter("FrequenciaDePadroes.txt") );

		TUTEDECC.frequenciasPadrao(in, padroes, out);
		
		in.close();
		out.close();
*/
	}
}