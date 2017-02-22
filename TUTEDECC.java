import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class TUTEDECC {
	
	public static void retiraLetras (BufferedReader in, BufferedReader letras, BufferedWriter out) throws IOException {

		try {
			String inStr = "";
			String StrASplitar = "";
			String outFinal = "";

			while ((inStr = in.readLine()) != null) {
			StrASplitar = StrASplitar + inStr;
			}
			
			String letrasStr = letras.readLine();
			String letrasFinal = letrasStr + letrasStr.toUpperCase() + letrasStr.toLowerCase();
			String outSplit = "["+ letrasFinal +"]";
			String[] inSplitado = StrASplitar.split(outSplit);
			
			for (int i = 0; i < inSplitado.length; i++) {
				outFinal = outFinal + inSplitado[i];
			}
			out.write(outFinal);
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage() + "Erro a ler o ficheiro");
		}
	};
	

	public static void letrasPorNumeros (BufferedReader in, BufferedWriter out) throws IOException {
		/*
	    String res = "";
	    for (Character c : in.readLine().toCharArray()) {
	        if(Character.isLetterOrDigit(c))
	            res += c;
	    }
	    System.out.println(res);
	}
		 */
		String inStr = "";
		String inStr2 = "";
		while ((inStr = in.readLine()) != null) {
			inStr2 = inStr2 + inStr;
			inStr2.replaceAll("[^a-zA-Z]", "").replaceAll(" ", "");
		}
		System.out.println(inStr2);
		out.write(inStr2);
	};
	
/*	
	public static void rotacao (BufferedReader in, BufferedWriter out, int i) throws IOException {
		
	};
	public static void frequenciasLetras (BufferedReader in, BufferedWriter out) throws IOException {
		
	};
	public static void frequenciasPadrao (BufferedReader in, BufferedReader padroes, BufferedWriter out) throws IOException {
		
	};
	
*/
};




