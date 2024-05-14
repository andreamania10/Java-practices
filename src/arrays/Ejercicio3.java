package arrays;

public class Ejercicio3 {

	int [] toArray(int num1, int num2) {
		int [] array = {num1, num2};
		for(int i=0; i <array.length; i++) {
			int resultado = array[i];
			System.out.println(resultado);
		}
		return null;
	
	}
	public static void main(String[] args) {
		Ejercicio3 i = new Ejercicio3(); 
		int [] resultado = i.toArray(5, 9);
			System.out.println(resultado);
	}

}
