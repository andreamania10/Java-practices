package ejerciciosimportantes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioAhorcado {

	String [] guionesBajos = {"_"};
	
	 char [] getPalabraSecreta() {
		String [] palabras = {"casa", "mazmorra", "puerta", "nenufar"};
		
		int posicionAleatoria = (int) Math.floor( Math.random() * palabras.length);
		String palabraSecreta = palabras[posicionAleatoria];

		char[] arraydePalabraSecreta= palabraSecreta.toCharArray();
		
		 char [] palabraConGuiones = new char [arraydePalabraSecreta.length];

		 for(int i=0; i < arraydePalabraSecreta.length; i++) {
			 palabraConGuiones[i] = '-';
		 }
		 System.out.println(palabraConGuiones);
		 return palabraConGuiones;
		} // toCharArray() convierte una cadena de texto en un array de letras
	 
	 
	 
	 	char [] arrayDeLetras() {
	 		
	 		
	 		
	 		System.out.println(new String(arrayDeLetras);	
	 	}
		
	 
	
				//recorrer la palabra con guiones, es la posicion. Bucle for, si la letra que correpsonde a la posición es igual ala letra que te ha dado. 
				//lo que recorro con el bucle es la palabrasecreta no la palabraconguiones. Recorro la palabrasecreta y compruebo si la letra que estoy analizando es la misma que la que ha puesto el usuario, y así reemplazo.
				//con el substring puedo coger una cadena de texto, string, quiero reemplazar el guionBajo4, para eso hago un substring desde la posición 0 hasta i (esta i sería el 2 (posición de la s) * 2( cada letra tendrá dos posiciones: una de letra y el espacio en blanco. Por cada letra, avanzaré dos posiciones) + L (la letra que ha introducido el usuario)
				//con un array de char se puede hacer más fácil 
				
				

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Adivina la palabra secreta. Escribe una letra: ");
	String letraRecibida = br.readLine();
	
	EjercicioAhorcado i = new EjercicioAhorcado(); 
	char [] almacenPalabraSecreta = i.getPalabraSecreta();
	System.out.println(almacenPalabraSecreta);
	
	
	
	

	}

}



/* print palabra recorrería a la palabraconguiones
1. Tablero

3. Array de palabras para adivinar Math Floor
4. Palabra secreta
5. Array de char
2. Pedirle al usuario
6. Bucle (si la letra introducida por el usuario) */