package fundamentos.java;

public class EjercicioFactorial {

	public static void main(String[] args) {
		int numero = 5;
		int resultado = 1;
		
		for (int i = 4; i > 0; i--) {
			resultado = numero * i;
			
			System.out.println(resultado);
		}
	}

}