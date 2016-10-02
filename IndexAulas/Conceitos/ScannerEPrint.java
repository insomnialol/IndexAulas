import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScannerEPrint { // classe com 1ª letra capital

	public static void main (String arg []){
		
		// Modificador final - (final) Funcionam como constantes
		// regra das constantes escrever com letras maiusculas e separar nomes com _
		final double PI = 3,141592653; // não consegue modificar este PI, é uma constante fixa
		final char = SEXO_MASCULINO = "M";
		final char = SEXO_FEMININO = "F";
		
		String myString = "Hi!"; // criamos uma string com o conteudo Hi!
		String myEmptyString = ""; // criamos uma string vazia

		// Metodos para converter valores de wrapper para outro tipo
		Double preco = new Double("12.45"); // convertido em string
		double d = preco.doubleValue(); // recuperei esse valor
		int i = preco.intValue(); // recuperei o inteiro desse valor
		byte b = preco.byteValue(); // recupera no tipo byte
		// .doubleValue();
		// .intValue();
		// .byteValue();
		// Integer.toString(int);
		
		// Metodos de conversao estatica
		double d1 = Double.parseDouble("123.45"); // um double em uma string
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		// por exemplo, binário num numero inteiro, com o método valueOF
		int i2 = Integer.valueOF("101011",2); //base 2
		system.out.println(i2); //Resposta: 43
		// converte no numero 43 na base binaria 2
		
		/* DATA TYPES EM JAVA / minimo / maximo / valor default / utilizaçoes
		byte	-128 / 127 / 0
		short	-32,768 / 32,767 / 0
		int	- 2,147,483,648 / 2,147,483,647 / 0
		long	-9,223,372,036,854,775,808 / 9,223,372,036,854,775,807 / 0L / quando necessitamos maior que int
		float	0.0f
		double	0.0d
		char	'\u0000' / '\uffff' / '\u0000'
		String (or any object)  	null
		boolean	false
		*/
		
		/* NOTAÇOES
		\n	Newline (0x0a)
		\r	Carriage return (0x0d)
		\f	Formfeed (0x0c)
		\b	Backspace (0x08)
		\s	Space (0x20)
		\t	tab
		\"	Double quote
		\'	Single quote
		\\	backslash
		\ddd	Octal character (ddd)
		\ uxxxx	Hexadecimal UNICODE character (xxxx)
		*/

		/* PRINTS
		 * double dim; char car = 'a';
		dim = readDouble("Double: "); // Double: 3.14
		println (dim); // 3.14
		printfd (10,3,dim); // 3,140
		println(); // (enter)
		printfe (10,30,dim); // 3.140e+00
		println (); // (enter)
		printf (-4,car); // a
		
		PRINTF
		d é decimal
		o é octal
		x é hexadexcimal
		f é real
		e é real em notaçao cientifica
		g e a é real
		b é booleano
		c é caracter
		s é string
		*/
		
		// SCANNER: só se deve utilizar um unico objeto do tipo scanner no programa inteiro
		Scanner scan = new Scanner(System.in); // criamos um objeto Scanner para ler os inputs do stdin	
		String inputString = scan.nextLine(); // lemos uma linha inteira de input do stdin e guardamos na nossa variavel
		/*
		scan.next(); // retorna o proximo token de input
		scan.nextInt(); scan.nextDouble();
		scan.readNext();
		scan.hasNext(); // retorna TRUE se houver outro token de input
		scan.nextLine(); // retorna a proxima linha de input
		scan.hasNextLine(); // retorna TURE se houver outra linha de input
		
		nextBoolean(); // lê o boolean seguinte
		nextByte(); // lê o byte seguinte
		nextShort(); // lê o shorr seguinte
		nextInt(); // lê o int seguinte
		nextLong
		nextFloat
		nextDouble
		
		*/
		
		scan.close(); // fechamos o objeto scanner
		
		System.out.println("Hello World!"); // imprime este texto
		System.out.println(inputString); // imprime o string seguindo de uma nova linha
		System.out.println("Text received: " + inputString); // imprime o texto + inputString concatenado
		System.out.printf("%s", inputString); // equivalente ao de cima
		
		
		// ARRAY DE CHARS (utilizaçao de .toCharArray() )
		String minhaString = "Esta string é um exemplo.";
		char[] meuArrayDeChars = minhaString.toCharArray();
		for(int i = 0; i < minhaString.length(); i++){
		    // Print each sequential character on the same line
		    System.out.print(meuArrayDeChars[i]); 
		}
		
		// INICIALIZAÇAO E UM ARAY DE CHARS
		final int _arraySize = 4; 		// the number of elements we want to hold
		String[] stringArray = new String[_arraySize]; // our array declaration
		for(int i = 0; i < _arraySize; i++) {   
			stringArray[i] = "This is stored in index " + i;  // assign value to index i
			System.out.println(stringArray[i]); // print value saved in index i
		}
		
		
		int a=1, b=2;
		System.out.println(a+b); // isto vai imprimir 3

 } 
}