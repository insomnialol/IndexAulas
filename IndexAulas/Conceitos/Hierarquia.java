
public class Hierarquia {

}

//// AGENDA TELEFONICA

class Data {
	public int dia;
	public int mes;
	public int ano;
}

class Agenda {
	public String nome;
	public String telefone;
	public Data aniversario = new Data();
}

public static void lerData (Data pData) {
	do { 
		do {
			pData.dia = readInt("Dia de aniversario? ");
		} while ((pData.dia < 0) || (pData.dia > 31));
		
		
	
	}
}