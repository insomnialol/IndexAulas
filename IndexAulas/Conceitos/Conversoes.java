
public class Conversoes {
	// Conversao entre sequencias de caracteres e agregados de caracteres
	char[] seqc = {'3', '8', '1', '0', '-', 'A', 'v', 'e', 'i', 'r', 'o'};
	String codigo = new String (seqc); // resulta na sequencia de caracters codigo = "3810-Aveiro"
	String codigo = String.copyValueOf(seqc); // resulta na sequencia de caracteres codigo = "3810-Aveiro"

	String cidade = new String (seqc, 5, 6); // resulta na sequencia de caracteres cidade = "Aveiro"
	String cidade = String.copyValueOf(sec, 5, 6); // resulta na sequencia de caracteres cidade = "Aveiro"
	
	String licao = new String ("Assim se cria uma string, ou seq de caracteres");
	
	String codigo = String.copyValueOf(seqc); // resulta na sequencia de caracteres codigo = "3810-Aveiro"
	
	
	// COPIDA DE SEQUENCIAS DECARACTERES PARA AGREGADOS DE CARACTERES
	
	// Classes Boolean, Character, Integer, Long, Float e Double  .toString
	// Classe String permite criar ou preencher um agregado de caracteres a partir de uma sequencia de caracteres usando:
	// toCharArray e getChars
	
	String codigo = new String ("3810-Aveiro");
	char[] letras;
	char[] cidade = new char [6];
	char[] num = new char [4];
	
	letras = codigo.toCharArray(); // UTILIZAÇAO DO toCharArray
	// letras = {'3', '8', '1', '0', '-', 'A', 'v', 'e', 'i', 'r', 'o'}
	
	codigo.getChars(0,4,num,0);
	// resulta do agregado de caracteres num = {'3', '8', '1', '0'}
	
}
