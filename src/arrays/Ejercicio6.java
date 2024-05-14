package arrays;

public class Ejercicio6 {
	int getLastElement (int num1, int num2) {
		int [] resultadoFinal = {num1, num2};
		return resultadoFinal[resultadoFinal.length-1];
	}
	public static void main(String[] args) {
		Ejercicio6 i = new Ejercicio6();
		int respuesta = i.getLastElement(1, 2);
		System.out.println(respuesta);
		
	}

}
