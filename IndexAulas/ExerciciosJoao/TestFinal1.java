package AulasJoao;

public class TestFinal1{
	
	private final int VALOR;
	
	public TestFinal1(){ 
		VALOR = 0;
	}
	
	public static void main(String args[]){
		TestFinal1 tf= new TestFinal1();
		System.out.println(tf.VALOR);
	} 
}

public class TestFinal2{
	
	public static void main(String args[]){
		final int VAL; 
		VAL =0; 
		System.out.println(VAL);
	} 
}
