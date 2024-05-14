package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioLetraDNI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
		boolean datosCorrectos = true; 
		while(datosCorrectos == true) {
			System.out.println("Escribe los números de tu DNI sin la letra final, por favor");
		    String dniSinLetra = br.readLine(); 

			if( dniSinLetra.length() < 8 || dniSinLetra.length() > 8) {
				System.out.println("Incorrecto");
			} else {
				int resultadoCorrecto = dniSinLetra.length() % 23;
				String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
				String letra = letras.substring(resultadoCorrecto, resultadoCorrecto+1);
				System.out.println(dniSinLetra + letra);
				break;
			
			}

		}
	}

}
