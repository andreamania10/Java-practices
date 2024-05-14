package arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		int [] numeros = new int [6];
		int num5 = 5; 
		int i = 0; 
		while(num5 > 0) {
			numeros[i] =  num5;
			i++;
			num5--;
		}
		for (int j=0; j<numeros.length; j++) {
			System.out.println(numeros[j]);
		}
	}

}
