import java.swing.*; // INTERFACE COM QUE A CLASSE DAS CAIXAS DE DIALOGO!!!

public class JOptionPane {
	public static void main (String[] args) {
		int a,b,resultado;
		String temp; // armazenamento temporario para o JOptionPane
		
		temp = JOptionPane.showInputDialog (null, "Primeiro Numero: "); // leitura das entradas a partir das caixas de dialogo
		a = Integer.parseInt(temp); // converte uma sequencia num inteiro
		
		temp = JOptionPane.showInputDialog (null, "Segundo Numero: ");
		b = Integer.parseInt(temp);
		
		JOptionPane.showMessageDialog (null, "Soma: " + (a+b)); // calculo do resultado e apresentaçao numa caixa de dialogo
	}
	
}
