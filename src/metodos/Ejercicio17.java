package metodos;


public class Ejercicio17 {
	
	public String testSize(int num) {
		
		if (num < 5) {
			  return "Tiny"; 
		  } else if (num < 10 ) {
			  return "Small"; 
		  } else if (num < 15 ) {
			  return "Medium"; 
		  } else if (num < 20) {
			  return "Large"; 
		  }  
			  return "Huge"; 
		  } 


	public static void main(String[] args) {
		Ejercicio17 i = new Ejercicio17(); 
		String resultado = i.testSize(25);
		System.out.println(resultado);
	}

}
