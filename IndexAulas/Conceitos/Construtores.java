import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Construtores {
	static String semnome = "Eu preciso de um nome!"; // variavel da classe
	int peso; // variavel de instancia
	String nome; // variavel de instancia
	String corCapa; // variavel de instancia
	
	// construtor default
	Construtores() { 
		this.peso = 0;
		this.nome = semnome;
		this.corCapa = "nenhuma";
	}
	
	// construtor parametrizado
	Construtores(int peso, String cor) { 
		// INICIALIZA AS VARIAVEIS DE INSTANCIA
		this.peso = peso;
		this.nome = semnome;
		this.corCapa = cor;
	}
	
	// construtor com parâmetros sobrecarregados
	Construtores(String umNome, String cor) { 
		// INICIALIZA AS VARIAVEIS DE INSTANCIA
		this.peso = 0;
		this.nome = umNome;
		this.corCapa = cor;
	}
		
	// METODOS - getter e setter (syntax standard)
	void setPeso(int peso) { // eg. cao.setPeso(5)
		this.peso = peso;
	}
	
	int getPeso() {
		return peso;
	}

}