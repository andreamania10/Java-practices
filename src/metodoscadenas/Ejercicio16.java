package metodoscadenas;

public class Ejercicio16 {

	int contadorDeLetras (String txt1, String letra) {
		int contador = 0; 
		for(int i=0; i<txt1.length(); i++) {
		 //En cada iteración acceder a 1 letra, entonces a la primera vale 0, luego a la 1, etc. 
			//Hacemos con un if para el parámetro letra == letra que recibimos como parámetro, entonces incrementamos el contador de letras. 
			if(txt1.toLowerCase().substring(i, i+1).equals(letra.toLowerCase())) {
				contador++;
			} 
			
		} return contador;  
	}
	public static void main(String[] args) {
		Ejercicio16 i = new Ejercicio16(); 
		int resultado = i.contadorDeLetras("Andrea", "a");
		System.out.println(resultado);
		
		
	}

}
