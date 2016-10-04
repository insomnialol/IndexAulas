
public class Inheritance {
	
	
	class MinhaSuperClasse{ // variavel de instancia superclasse
	    String minhaString;
	        
	    MinhaSuperClasse(){} // construtor default (vazio) da superclasse
	    
	    MinhaSuperClasse(String minhaString){ // construtor parametrizado da superclasse      
	        this.myString = minhaString; // inicializa variavel de instancia
	    }
	}
	
	class MinhaSubClasse extends MinhaSuperClasse {
	    
	    MinhaSubClasse(String minhaString){ // construtor de subclasse
	        super(minhaString); // chamada explicita ao constutor de superclasse
	    }
	    
	    // o que acontece na chamada implicita da superclass
	    MinhaSubClasse(String minhaString) { 
	        this.minhaString = minhaString; 
	    }
	}

	/* OVERRIDING METHODS, boa pratica usar a anotaçao @Override
	
}
