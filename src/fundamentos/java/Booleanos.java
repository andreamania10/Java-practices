package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booleanos {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//Ejercicio 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca tu nota: ");
		int nota = Integer .parseInt(br.readLine()); 
		
		if(nota > 5) {
			System.out.println("Has aprobado");
		} else if (nota == 5) {
			System.out.println("Aprobado por los pelos");
		} else {
			System.out.println("Has suspendido");
		}
		
		//Ejercicio 2
		System.out.println("Introduzca un número");
		int valor = Integer .parseInt(br.readLine()); 
		
		if(valor >= 0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");
		}
		
		if(valor % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		if(valor % 5 == 0) {
			System.out.println("Es múltiple de 5");
		} else {
			System.out.println("No es múltiple de 5");
		}
		
		if(valor % 10 == 0) {
			System.out.println("Es múltiple de 10");
		} else {
			System.out.println("No es múltiple de 10");
		}
		
		if(valor > 100) {
			System.out.println("Es mayor de 100");
		} else {
			System.out.println("Es menor de 100");
		}
	}
}
