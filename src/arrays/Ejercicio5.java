package arrays;

public class Ejercicio5 {
	
	int [] setFirstElement (int num1, int num2, int num3) {
		int [] resultadoFinal = {num3, num2};
		return resultadoFinal;
	}
	

	public static void main(String[] args) {
		Ejercicio5 i = new Ejercicio5(); 
		int[] resultado = i.setFirstElement(1, 2, 3);
		
		for(int j=0; j<resultado.length; j++) {
			System.out.println(resultado[j]);
		}
	}

}
