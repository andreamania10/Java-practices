package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3oportunidades {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numero = (int) Math.floor(Math.random() * 5); 
		
		int intentos = 0; 
		while(intentos < 3) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("Escribe un número, por favor");
		    int resultado = Integer .parseInt(br.readLine()); 
		    
		    if(resultado != numero) {
		    	System.out.println("Incorrecto");
		    	intentos++;
		    	if (intentos == 3) {
		    		System.out.println("Has perdido");
		    		break;
		    	}
		    } else {
		    	System.out.println("Correcto");
		    	System.out.println(numero);
		    	break;
		    }
		}
	}

}
