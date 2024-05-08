package booleanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	void recoger () throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un número, por favor: ");
		int resultado = Integer .parseInt(br.readLine());
		resultado = resultado * resultado * resultado; 
		System.out.println(resultado);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Ejercicio2 i = new Ejercicio2(); 
		i.recoger();
	}

}
