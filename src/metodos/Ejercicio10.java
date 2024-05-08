package metodos;

public class Ejercicio10 {

	public String testLogicalOr(int val) {
		  if (val >= 10 && val <= 20) {
		    return "Inside";
		  }else {
		    return "Outside";
		  }
		}
	
	public static void main(String[] args) {
		Ejercicio10 m = new Ejercicio10(); 
		String resultado = m.testLogicalOr(21);
		System.out.println(resultado);

	}

}
