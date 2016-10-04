// Array.sort(int[] a) - Sorts the specified array into ascending numerical order
// VER MAIS FUNÇOES DE ARRAYS: https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

public class Arrays {
	int[] b = {10,20,30,40,50,60};
	double[] c = {10.2, 11.8, 0.0};
	
	static void imprimirSequencia (int[] pA, int pNElem) {
		for(int i = 0; i < pNElem; i++) printf("Sequencia[%d] = %d\n", i, pA[i]);
		
		// main
		// int[] a = new int[5];
		// impromirSequencia (a, 5);
	}
	
}

// OUTRO EXEMPLO - funçao que tem uma sequencia como resultado de saida

public static int[] criarSeqDiferencas (int[] pSeq, int pNElem) {
	int i;
	int [] seqDif = new int [pNElem-1];
	for (i = 0; i < pNElem-1; i++)
		seqDif[i] = pSeq[i+1] - pSeq[i]; 
	return seqDif;
}

// main
int[] seq = new int [100];
int n;
int[] dif;

...

dif = criarSeqDiferencas (seq, n);


// OUTRA SITUAÇAO

int[] sx = new int [10]; // cria seq sx
int[] sy = new int [10]; // cria seq sy

// 'erro' comum
sy = sx; // copia da referencia! sy e sx referenciam a mesma sequencia

// forma correta para copiar a sequencia
for (i = 0; i < sx.length; i++)
	sy[i] = sx[i]; // copia da sequencia!

// ou recorremos ao arraycopy da classe System
// plublic static void arraycopy (tipo[] seqOrigem, int posOrigInicial, tipo[] seqDestino, int posDestInic, int NEelem)
System.arraycopy(sx, 0, sy, 0, sx.length);



///////////////////////////////// SEQUENCIAS BIDIMENSIONAIS /////////////////////

int[][] c = new int[2][3]; // b.length=2 e b[0].length = 3 e b[1].length = 3 

int[][] d = new int[2][];
d[0] = new int[4];
d[1] = new int[2];

int[][] e = { // e.length = 2 , e[0].length = 3 , e[1].length = 3
		{1,2,3},
		{4,5,6}
		};

int[][] f = { // f.length = 3 , f[0].length = 2 , f[1].length = 1 , f[2].length = 3
		{7,5},
		{-3},
		{3,6,8}
};


// imprimir sequencia bidimensionais , utilizar FOR encadeados

public static void imprimirSequenciaBidimensional (int[][] pSeqB) {
	int i, j;
	
	for (i=0; i < pSeqB.length; i++)
		for (j=0; j < pSeqB[i].length; j++)
			printf("SequenciaB[%d][%d] = %d\n", i, j, pSeqB[i][j]);
}

int[][] matriz = new int[5][3];
...

imprimirSequenciaBidimensional(matriz);