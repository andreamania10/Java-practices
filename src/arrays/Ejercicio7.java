package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Introduzca un número del 1 al 12: ");
	int respuesta = Integer .parseInt(br.readLine()); 
	
	String [] mesesAño = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};

	if(respuesta >=1 && respuesta <=12) {
		System.out.println(mesesAño[respuesta -1]);;
	}
	}
}
