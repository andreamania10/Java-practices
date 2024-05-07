package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BooleanNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int contador = 0; 
		boolean datos = false;
		while(datos == false) {
			System.out.println("Introduzca un número");
			int numero = Integer .parseInt(br.readLine());
			
			if(numero < 0) {
				datos = true; 
				System.out.println(contador);
			} else {
				contador++;
			}
		}
	}

}
