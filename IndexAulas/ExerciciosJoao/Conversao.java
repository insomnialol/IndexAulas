package AulasJoao;
import java.util.Scanner;

public class Conversao {
	public static void main ( String[] args) {
		final double MIL _QUI = 1.609;
		double milhas, quilometros;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Distancia em milhas?");
			milhas = teclado.nextDouble();
		} while (milhas < 0.0);
		
		quilometros = MIL_QUI * milhas;
		System.out.println("Distancia em quilometros é "+ quilometros);
	}
}
