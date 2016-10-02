import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Operadores {

	
	// OPERADORES
	// +: A binary operator used for String concatenation
	// ++: This unary operator is used to preincrement (increment by 1 before use) when prepended to a variable name or postincrement (increment by 1 after use) when appended to a variable.
	// --: This unary operator is used to predecrement (decrement by 1 before use) when prepended to a variable name or postdecrement (decrement by 1 after use) when appended to a variable.
	// !: This unary operator means not (negation). It's used before a variable or logical expression that evaluates to true or false.
	// ==: This binary operator is used to check the equality of 2 primitives.
	// !=: This binary operator is used to check the inequality of 2 primitives.
	// <, >, <=, >=: These are the respective binary operators for less than, greater than, less than or equal to, and greater than or equal to, and are used to compare two operands.
	// &&, ||: These are the respective binary operators used to perform logical AND and logical OR operations on two boolean (i.e.: true or false) statements.
	// ? : This ternary operator is used for simple conditional statements (i.e.: if ? then : else).
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double custoRefeicao = scan.nextDouble();
		int percentagemGorjeta = scan.nextInt();
		int percentagemIVA = scan.nextInt();
		scan.close();
			
		// IVA 28% , IVA = custo * percentagemIVA/100
		// Gorjeta = custo * percentagemGorjeta/100
		double custoFinal = custoRefeicao + (custoRefeicao*((double) percentagemGorjeta/100)) + (custoRefeicao*((double) percentagemIVA/100)); 
		System.out.println("O custo arredondado final da refeição é "+ (int) Math.round(custoFinal) + " euros."); // nao esquecer o type-cast para arrendondar o custoFinal como int
		
	}	
}
