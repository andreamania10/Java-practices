package fundamentos.java;

public class EjercicioPotenciaBucleFor {

	public static void main(String[] args) {
		int base = 2;
		int exponente = 4;
		int resultado = 1;
		for(int i = 0; i < exponente; i++) {
			 resultado = resultado * base; 
			 System.out.println(resultado);
		}
	}

}
