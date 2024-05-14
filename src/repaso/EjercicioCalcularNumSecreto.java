package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCalcularNumSecreto {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int numero = (int) Math.floor(Math.random() * 5); 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un número, por favor");
	    int resultado = Integer .parseInt(br.readLine()); 
	    
	    if(resultado == numero) {
	    	System.out.println("Correcto");
	    	System.out.println(numero);
	    	
	    } else {
	    	System.out.println("Incorrecto");
	    	System.out.println(numero);
	    }
	}

}
