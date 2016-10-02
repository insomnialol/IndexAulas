import java.util.*;

public class ArrayList {
	// ArrayList permite criar sequencias dinamicas, cuja capacidade de armazenamento é ajustavel
	// criaçao da ArrayList
	// ArrayList<Classe> lista = new ArrayList<Classe> ();
	
	ArrayList<Integer> seqd = new ArrayList<Integer> (); // criaçao de uam seq dinamica de inteiros
	
	seqd.add(2); // insercao do 2 no fim da sequencia. seqd[0] = 2
	seqd.add(3); // insercao do 3 no fim da sequencia. seqd[1] = 3
	seqd.add(1,5); // insercao do 5 na posicao 1
	// neste momento temos: seqd[0] = 2, seqd[1] = 5, seqd[2] = 3 (o 3 foi 'empurrado')
	
	int x = seqd.get(1); // copia do segundo elemento, x = 5
	int y = seqd.get(seqd.size()-1); // copia do ultimo elemento, usando a funçao SIZE, y = 3
	seqd.remove(0); // remocao do primeiro elemento, seqd[0] = 5 e seqd[1] = 3
	seqd.set(1,7); // substituicao do segundo elemento, seqd[0] = 5 e seqd[1] = 7 (era 3)
	

	public static double[] lerSequenciaArrayList() {
		ArrayList<Double> lista = new ArrayList<Double> (); 
		double valor; double[] seqd; int i; 
		
		while (true) {
			valor = readDouble ("Introducao um numero? "); 
			if ( valor == 0.0) break; 
			lista.add(valor);
		}
		
		// copia a sequencia dinamica para uma sequencia estatica de doubles
		seqd = new double [lista.size()];
		for (i=0; i < seqd.length; i++) seqd[i] = lista.get(i); 
		return seqd;
	}
}


