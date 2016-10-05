
// o melhor conceito de uma classe abstrata no mundo real é a maquina de refrescos, a unic coisa que importa é o que a maquina faz (dispensa a bebida pedida)

/* CLASSES ABSTRATAS
Este tipo de classes podem ter METODOS ABSTRATOS assim como METODOS DEFINIDOS, mas nao pode ser instanciada.
Para utilizarmos uma classe abstrata precisamos de criar e instanciar uma SUBCLASSE que EXTENDA a classe abstrata
E quaisquer metodos declarados numa classe abstrata devem ser implementados pelas suas subclasses
*/


// EXEMPLO DA CLASSE ABSTRATA CANINE e 2 SUBCLASSES de raças caninas: KleeKai e SiberianHusky

abstract class Canine{ // SUPERCLASSE
    // instance variables
    String name;
    String color;
    String gender;
    int age;
    
    Canine(String name, String color, int age, char mF){  // construtor parametrizado
        this.name = name;
        this.color = color;
        this.age = age;
        this.gender = (mF == 'M') ? "Male " : "Female ";
    }
    
    abstract String getBreed(); // declaraçao de metodo abstrato
    
    void printInfo(){ // metodo definido
    	// print information about the dog:
        System.out.println(name + " is " + ((age%10 == 8)? "an " : "a ") + age + " year old " 
           + gender + getBreed() + " with a " + color + " coat.");
        // note: the '(age%10 == 8)' conditional ensures grammatical correctness if dog is 8 or 18; dogs do not live longer than this.
    }
}

class KleeKai extends Canine{ // SUBCLASSE de Canine
	/** Parameterized Constuctor **/
    KleeKai(String name, String color, int age, char mF){ 
        super(name, color, age, mF); 
    }
    

    String getBreed(){ // abstract method implementation
        return "Klee Kai";
    }
}


class SiberianHusky extends Canine{ // SUBCLASSE de Canine
	/** Parameterized Constuctor **/
    SiberianHusky(String name, String color, int age, char mF){ // Constructor
        super(name, color, age, mF); 
    }
    
    String getBreed(){ // abstract method implementation
        return "Siberian Husky";
    }
}


/* 
 * 
// o seguinte codigo resulta em ERRO: Canine is abstract; cannot be instantiated
// Canine myPuppy = new Canine("Lilah", "Grey/White", 5, 'F'); 

// contudo o seguinte codigo
Canine c = new KleeKai("Lilah", "Grey/White", 5, 'F');
Canine d = new SiberianHusky("Alaska", "Grey/Black/White", 16, 'F');
c.printInfo();
d.printInfo();
// vai executar o seguinte
Lilah is a 5 year old Female Klee Kai with a Grey/White coat.
Alaska is a 16 year old Female Siberian Husky with a Grey/Black/White coat.

*/



// UM OUTRO EXEMPLO 

import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book{ 
    int BookPrice; 
    public MyBook(String title, String author, int price){ 
        super(title,author); 
        BookPrice = price; 
    } 
    
    public void display(){ 
        System.out.println("Title: "+this.title); 
        System.out.println("Author: "+this.author); 
        System.out.println("Price: "+BookPrice); } 
}

public class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}
