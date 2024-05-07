package fundamentos.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lecturadedatos {
	public static void main(String[] args) throws IOException {
	//Ejercicio 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un valor en euros, por favor: ");
		String txt = br.readLine();
		int n = Integer.parseInt(txt);
		
		System.out.println("Euros = " + n );
		System.out.println("Dolares = " + n * 2 );
		
	//Ejercicio 2
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduza el precio, por favor: ");
		String txt2 = br2.readLine();
		int n2 = Integer.parseInt(txt2);
		
		System.out.println("El precio con IVA incluído es: " + n2 * 1.21);
		
	//Ejercicio 3
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca un número, por favor: ");
		String txt3 = br3.readLine();
		int n3 = Integer.parseInt(txt3);
		
		System.out.println("Valor introducido = " + n3);
		System.out.println("Doble valor = " + n3 * 2);
		System.out.println("Triple valor = " + n3 * 3);
	
	//Ejercicio 4
		BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca el ancho, por favor: ");
		int ancho = Integer .parseInt(br4.readLine());
		System.out.println("Introduzca el alto, por favor: ");
		int alto = Integer .parseInt(br4.readLine());
		
		int area = ancho * alto; 
		int perimetro = ancho * alto * ancho * alto;
		
		System.out.println("Area del rectángulo = " + area);
		System.out.println("Perímetro del rectángulo = " + perimetro);
	
	//Ejercicio 5
		System.out.println("Introduzca los grados centígrados: ");
		int gradoc = Integer .parseInt(br.readLine());
		int gradof = gradoc * 9/5 + 32; 
		
		System.out.println("Grados centígrados: " + gradoc);
		System.out.println("Grados farenheit: " + gradof);
	
	//Ejercicio 6
		System.out.println("Introduzca tu nombre, por favor:");
		String nombre = br.readLine();
		System.out.println("Introduzca el material de la caja, por favor:");
		String material = br.readLine();
		System.out.println("Introduzca las dimensiones de la caja, por favor:");
		String dimensiones = br.readLine();
		System.out.println("Introduzca un comentario, por favor:");
		String comentario = br.readLine();
		
		System.out.println(nombre + " ha pedido una caja de " + material + " con unas dimensiones " + dimensiones + ". " + comentario + "." );
	}
}
