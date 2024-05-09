package metodoscadenas;

public class Ejercicio13 {

	String crearPalabra (char letra, int num) {
	String palabra  ="";
	
		for(int i=0; i < num; i++) {
			palabra+=letra; 
			
		} return palabra.toUpperCase();
		 
	}
	public static void main(String[] args) {
		Ejercicio13 i = new Ejercicio13(); 
		String resultado = i.crearPalabra('a', 3);
		System.out.println(resultado);
	}

}

/*Hacer una función crearPalabra que reciba como parámetro de entrada 
una letra y un número y genere una nueva palabra que tenga la letra 
introducida repetida tantas veces como indique el número.*/