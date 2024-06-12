package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {

	public static void main(String[] args) throws PrecioDemasiadoAltoException {
		getPrecioConIva(); 
	}


static void getPrecioConIva() throws PrecioDemasiadoAltoException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un número");
	int numero;
	try {
		numero = Integer .parseInt(br.readLine());
		System.out.println(numero);
		double numeroMultiplicado = numero * 1.16; 
		System.out.println(numeroMultiplicado);
		if(numeroMultiplicado > 100) {
			throw new PrecioDemasiadoAltoException("Excepción lanzada");
			}
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
}
}