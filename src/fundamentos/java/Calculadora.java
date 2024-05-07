package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserte un número: ");
		int numero1 = Integer .parseInt(br.readLine()); 
		System.out.println("Inserte otro número, por favor: ");
		int numero2 = Integer .parseInt(br.readLine());
		System.out.println("Inserte un operador, por favor: + - * /");
		String operador = br.readLine(); 
		
		switch(operador) {
		case "+":
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		default:
			System.out.println("default");
		}
	}

}
