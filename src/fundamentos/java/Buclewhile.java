package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buclewhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean datosCorrectos = false; 
		while (datosCorrectos == false) {
		System.out.println("Introduzca tu nombre, por favor");
		String nombre = br.readLine(); 
		if (nombre.equals("")) {
			System.out.println("Error");
		} else {
		System.out.println("Es correcto tú información? si / no "); 
		String respuesta = br.readLine(); 
		if (respuesta.equals("si")) {
			System.out.println("Puedes continuar con el examen");
			datosCorrectos = true;}
		}
		
		}	
		
		
	}
}