package AulasJoao;
// LIVRO PAGINA 256


// IMPLEMENTAÇAO

import static pt.ua.prog.WIO.*;

public class SimularAtleta {
	public static void main(String[] args) {
		Atleta atleta = new Atleta(); // criar o registo do atleta
		double marca; // marca ultima prova
		int opcao;
		char cont; // respota de continuacao
		lerAtleta(atleta); // ler info do atleta

		do {
			clear(); 
			printf(" 1 - Inserir a marca da ultima prova\n");
			printf(" 2 - Retirar a marca da ultima prova\n");
			printf(" 3 - Escrever informaçao do atleta\n");
			printf(" 4 - Terminar o programa\n");

			do { opcao = readInt ("Opcao? ");
			while ((opcao < 1) || (opcao > 4));

			switch (opcao) {
			case 1 : do { marca = readDouble("Marca da ultima prova? "); }
			while ((marca < 0.0) || (marca > 10.0));

			if (!inserirProva(atleta, marca)) // executa a funçao e testa se retorna true ou false
				printf("Erro na execucao da operacao\n");
			break;

			case 2 : if (!retirarProva(atleta)) // executa a funçao e testa se retorna true ou false
				printf("Erro na execucao da operacao\n");
			break;

			case 3 : escreverAtleta (atleta);		 
			}

			cont = readChar("Carregue em Enter para continuar");
			}
		} while (opcao != 4);


	}

	public class Atleta {
		public String nome;
		public int numero;
		public int nprovas;
		public double[] provas = new double[6];
		public double resultado;

		public static void lerAtleta (Atleta pAtleta) {
			printf("\nLeitura dos dados de um ginasta\n");
			pAtleta.nome = readLine("Nome? ");

			do {
				pAtleta.numero = readInt("Numero de inscricao? ");
			} while (pAtleta.numero <= 0);
		}

		public static void escreverAtleta (Atleta pAtleta) {
			int i;

			printf("\nEscrita dos dados do ginasta nº %d", pAtleta.numero);
			printf("Nome: %s\n", pAtleta.nome);
			printf("Numero de provas ja realizadas: %d\n", pAtleta.nprovas);

			if (pAtleta.nprovas > 0) {
				printf("Marcas obtidas nas provas já realizadas: ");
				for (i=0; i < pAtleta.nprovas; i++)
					printf("%5.2f", pAtleta.provas[i]);
				printf("\nResultado actual: %6.2f\n", pAtleta.resultado);
			}
		}

		public static boolean inserirProva (Atleta pAtleta, double pMarca) // inserir marca da ULTIMA PROVA realizada
		{
			if (pAtleta.nprovas < 6) {
				pAtleta.provas[pAtleta.nprovas] = pMarca;
				pAtleta.resultado += pMarca;
				pAtleta.nprovas++;
				return true;
			} else return false;
		}

		public static boolean retirarProva (Atleta pAtleta) { // remover marca da ULTIMA PROVA realizada
			if (pAtleta.nprovas > 0) {
				pAtleta.nprovas--;
				pAtleta.resultado -= pAtleta.provas[pAtleta.nprovas];
				pAtleta.provas[pAtleta.nprovas] = 0.0;
				return true;
			} else return false;
		}
	}
