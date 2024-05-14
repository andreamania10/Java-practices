package statico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1Calculadora {
	
	static int sumar(int a, int b){
	    return a+b;
	}

	static int restar(int a, int b) {
		return a-b; 
	}

	static int multiplicar(int a, int b) {
		return a*b; 
	}

	static int dividir(int a, int b) {
		return a / b; 
	}

	
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Escribe un número, por favor");
	    int n1 = Integer .parseInt(br.readLine());
	    System.out.println("Escribe otro número, por favor");
	    int n2 = Integer .parseInt(br.readLine());
	    System.out.println("Escribe un operador, por favor: + - * /");
	    String op = br.readLine();
	    
	    int resultado = 0;
	    if( op.equals("+")){
	        resultado = sumar(n1, n2);
	    }else if(op.equals("-")){
	    	resultado = restar(n1, n2);
	    }else if(op.equals("*")) {
	    	resultado = multiplicar(n1, n2); 
	    } else if (op.equals("/")) {
	    	resultado = dividir(n1, n2);
	    }

	    System.out.println(resultado);
	}

	
}
