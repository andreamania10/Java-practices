package booleanos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraBooleana {
	
	void recoger() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe un número, por favor"); 
		int a = Integer .parseInt(br.readLine());
		System.out.println("Escribe otro número, por favor"); 
		int b = Integer .parseInt(br.readLine());
		System.out.println("Escribe un operador, por favor: + - * /");
		String op = br.readLine();
		
		if (op.equals("+")) {
			suma(a, b);
		} else if (op.equals("-")) {
			resta(a,b);
		}  else if (op.equals("*")) {
			multiplicacion(a,b);
		} else if (op.equals("/")) {
			division(a,b);
		} else {
			System.out.println("Error"); 
		}
		
	}
	
	
	void suma(int a, int b) {
		int sumar = a + b; 
		System.out.println(a + " + " + b + " = " + sumar);}
	
	void resta(int a, int b) {
		int restar = a - b; 
		System.out.println(a + " - " + b + " = " + restar);}
	
	void multiplicacion(int a, int b) {
		int multiplicar = a * b; 
		System.out.println(a + " * " + b + " = " + multiplicar);
	}
	
	void division(int a, int b) {
		int dividir = a / b; 
		System.out.println(a + " / " + b + " = " + dividir);}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		CalculadoraBooleana i = new CalculadoraBooleana(); 
		i.recoger();;
	}
}
