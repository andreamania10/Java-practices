package metodos;

public class Ejercicio6 {
	public String testGreaterThan(int val) {
		  if (val <= 12) { 
		    return "Menor o igual a 12";
		    
		  }

		  else if (val <= 24 ) { 
		    return "Menor o igual a 24";
		  }
		  
		  return "Más de 24";
		}
	
	public static void main(String[] args) {
		Ejercicio6 m = new Ejercicio6(); 
		String resultado = m.testGreaterThan(11);
		System.out.println(resultado);

	}

}
