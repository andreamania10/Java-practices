package arrays;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		int [] cadena = new int [6];
		int num5 = 5; 
		int i = 0; 
		
		for(int j=0; j <cadena.length; j++) {
			cadena[i] = num5; 
			i++;
			num5--;
			System.out.println(cadena[j]);
		}
		
		
	}

}
