
public class Strings {
	// sequencias de caracteres como parametros de subprogramas
	public static int numAlgarismos (String pStr) {
		int i, nCar = pStr.length(), nAlg = 0;
		for (i=0; i < nCar; i++) // verificar se o caracter é numerico
			if (pStr.charAt(i) >= '0' && pStr.charAt(i) <= '9') nAlg++; // UTILIZAÇAO DO charAt
		return nAlg; // devolver a contagem dos caracteres numericos
	}
	
	String texto = "3810-Aveiro"; int n;
	...
	n = numAlgarismos(texto); // invocaçao para a variavel texto
	
	
	// isDigit e isLetter
	// funçao com resultado de saida do tipo sequencia de caracteres
	public static String criarSeqAlfabeticos (String pStr) {
		int i, nCar = pStr.length(); char car
		String strLetras = ""; // seq de chars nula
		
		for(i=0; i<nCar; i++) {
			car = pStr.charAt(i);
			if(Character.isLetter(car)) // verificar se é caracter alfabetico
				strLetras += car; // concatenar o caracter à sequencia
		}
		return strLetras; // devolver a sequencia
	}
	
	// if ( Character.isLowerCase(seq[c]) )
	// if ( Character.isUpperCase(seq[c]) )
	
	/* FUNÇOES DE PESQUISA - PAG 329
	public static int indexOf
	public static int lastIndexOf
	public static boolean startsWith
	public static boolean endsWith
	*/
	
	String texto = "Universidade de Aveiro"; int n; boolean teste;
	n = texto.indexOf('i'); // primeira ocorrencia de i ( n = 2 )
	n = texto.lastIndexOf('i'); // ultima ocorrencia de i ( n = 19 )
	n = texto.indexOf('l'); // primeira ocorrencia de l, que nao existe ( n = -1 )
	n = texto.indexOf("de"); // primeira ocorrencia de de ( n = 10 )
	n = texto.lastIndexOf("de"); // ultima ocorrencia de de ( n = 13 ) 
	n = texto.indexOf('i',5); // primeira ocorrencia de i, depois da posicao 5 ( n = 7 )
	n = text.lastIndexOf("boa"); // ultima ocorrencia de boa, que nao existe ( n = -1 )
	teste = texto.startsWith("de"); // começa com o texto de? (teste = FALSE)
	teste = texto.endsWith("de"); // acaba com o texto de? (teste = FALSE)
	
	// compareTo - usada para ordenar sequencias de caracteres
	// equals - usada para detectar uma sequencia de caracteres de terminaçao
	// equalsIgnoreCase - compara as seq de caracteres sem distinguir caracteres maisculos de minusculos
	// compareToIgnoreCase - compara as seq sem distinguir caracteres maisculos de minusculos
	
	String cidade = "Aveiro";
	String nome1 = "abel"; String nome2 = "abelardo";
	int n; boolean teste;
	
	teste = cidade.equals("AVEIRO"); // cidade exactamente igual à sequencia "AVEIRO"? ( teste = FALSE )
	teste = cidade.equalsIgnoreCase("AVEIRO"); // teste = TRUE
	
	n = nome1.compareTo(nome2); // como "abel" < "abelardo" ( n = -4 ) 
	n = nome1.compareTo("aaaa"); // como "abel" > "aaaa" ( n = 1 )
	n = nome1.compareToIgnoreCase("ABEL"); // "abel" é igual a "ABEL" ( n = 0 )
	
	// funçoes de substituiçao e conversao
	// replace
	// replaceAll
	// replaceFirst
	// toLowerCase
	// toUpperCase
	// valueOf
	
	String texto = "Universidade de Aveiro"; String nova, outra;
	boolean teste = false;
	
	nova = texto.replace('i','x'); // ( nova = "Unxversxdade de Avexro" ) 
	nova = texto.replaceAll("de", "ed");
	nova = texto.replaceFirst("de","ed"); // substitui só a primeira de por ed
	nova = texto.toUpperCase();
	outra = texto.toLowerCase();
	nova = String.valueOf('x'); // nova = "x"
	nova = String.valueOf(123); // valor inteiro    nova = "123"
	nova = String.valueOf(1.25e02); // valor real      nova = "125.0"
	nova = String.valueOf(teste); // teste é falso         nova = "false"
	
	// funcoes de criacao e modificacao
	// concat
	// substring
	
	String texto = "Universidade"; String cidade = "Aveiro"; 
	String copia; String cidesp = "      Aveiro      "; 
	String nova = "";
	nova = nova.concat(texto).concat(" de ").concat(cidade); // nova = "Universiade de Aveiro"
	copia = texto.toString(); // copiar uma seq de caracteres
	String sub = nova.substring(10); // subsequencia a começar na posicao 10 ( sub = "de de Aveiro" ) 
	String semesp = cidesp.trim(); // retira espaços no inicio e fim ( semesp = "Aveiro" )
	
	
	// funçao de partiçao
	// split
	String frase = "Universidade de Aveiro"; String[] sf;
	sf = frase.split(" "); // divide pelos espaços ( sf[0] = "Universidade" , sf[1] = "de" , sf[2] = "Aveiro" )
	sf = frase.split("de",2); // divide a frase pelo texto "de" nas duas ( sf[0] = "Universida" , sf[1] = " de Aveiro" ) 
	
	String frase = "era#uma$#vez#um$"; String[] = sf;
	sf = frase.split("[$#]"); // divide a frase pelos caracteres $ e #
	// sf[0] = "era" sf[1] = "uma" sf[2] = "" sf[3] = "vez" sf[4] = "um"
	
	// funçoes especificas para seq de caracteres dinamicas
	// append
	// insert
	// replace
	// delete
	// reverse
	// deleteCharAt
	// setCharAt
	// capacity
	// exemplos PAG 337
	
	// sequencias de sequencias de caracteres
	// exemplo da funçao de conversao do mes em numero para o mes por extenso
	public static String mesExtenso (int pMes) {
		String[] meses = { "Mês Errado", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		if ((pMes < 1) || (pMes > 12)) return meses[0]; // Mês Errado
		else return meses[pMes];
	}
	
}
